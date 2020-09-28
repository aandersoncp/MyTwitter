package mytwitter;

import excecoes.MFPException;
import excecoes.PDException;
import excecoes.PEException;
import excecoes.PIException;
import excecoes.PJSException;
import excecoes.SIException;
import excecoes.UJCException;
import excecoes.UNCException;
import java.util.Arrays;
import mytwitter.repositorio.IRepositorioUsuario;
import mytwitter.repositorio.Repositorio;
import mytwitter.perfil.tweet.Tweet;
import mytwitter.perfil.Perfil;
import java.util.Vector;
import java.util.Calendar;
import java.util.Comparator;

public class MyTwitter implements ITwitter{
    
    private IRepositorioUsuario repositorio;
    
    public MyTwitter(){
        this.repositorio =  new Repositorio();
    }
    
     public IRepositorioUsuario getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(IRepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }
    
    @Override
    public void criarPerfil(Perfil usuario) throws UJCException, PEException { // Não está funcionando
        try{
            repositorio.cadastrar(usuario);
        }
        catch(UJCException ujc){
            throw new PEException(usuario.getUsuario());
        }
    }

    @Override //OK
    public void cancelarPerfil(String usuario) throws PIException, PDException{
        Perfil conta = repositorio.buscar(usuario);
        if(conta == null){
            throw new PIException(usuario);
        } else{
            if(conta.isAtivo()){
                conta.setAtivo(false);
                try {
                    repositorio.atualizar(conta);
                } catch (UNCException ex) {
                    System.out.println("");
                }
                System.out.println("Conta de " + conta.getUsuario() + " cancelada.");
                System.out.println("Ativo: " + conta.isAtivo());
            } else {
                throw new PDException(usuario);
            }
        }
    }

    @Override
    public void tweetar(String usuario, String mensagem) throws PIException, MFPException{
        if(mensagem.length() > 140 || mensagem.length() < 1){
            throw new MFPException();       
        } else {
            Perfil conta = repositorio.buscar(usuario);
            if(conta == null){
                throw new PIException(usuario);
            } else {
                Tweet novo = new Tweet();
                novo.setMensagem(mensagem);
                novo.setUsuario(usuario);
                conta.addTweet(novo);
                try {
                    repositorio.atualizar(conta);
                } catch (UNCException ex) {
                    System.out.print("");
                }
            }
        }
    }

    @Override 
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException{ 
        Perfil conta = repositorio.buscar(usuario);
        if(conta == null){
            throw new PIException(usuario);
        } else{
            if(conta.isAtivo()){
                Vector<Tweet> mural = new Vector<Tweet>();
                int i = 0, j = 0;
                Perfil novo;
                while(i < conta.getSeguindo().size()){
                    j = 0;
                    novo = repositorio.buscar(conta.getSeguindo().get(i));
                    while(j < novo.getTimeline().size()){
                        mural.add(novo.getTimeline().get(j));
                        j++;
                    }
                    i++;
                }
                i = 0;
                while(i < conta.getTimeline().size()){
                    mural.add(conta.getTimeline().get(i));
                    i++;
                }
                return mural;
            } else {
                throw new PDException(usuario);
            }
            
        }
    }

    @Override 
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException{
        Perfil conta = repositorio.buscar(usuario);
        if(conta == null){
            throw new PIException(usuario);
        } else{
            if(conta.isAtivo()){
                return conta.getTimeline();
            } else {
                throw new PDException(usuario);
            }
        }
    }

    @Override //OK 
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException, PJSException{
        Perfil conta1 = repositorio.buscar(seguido);
        if(conta1 == null){
            throw new PIException(seguido);
        } else if (!(conta1.isAtivo())){
            throw new PDException(seguido);
        } else {
            Perfil conta2 = repositorio.buscar(seguidor);
            if(conta2 == null || seguidor.equals(seguido)){
                throw new SIException(seguidor);
            } else{
                if(!(conta2.isAtivo())){
                    throw new PDException(seguidor);
                } else{
                    boolean existe = false;
                    for(int i = 0; i < conta1.getSeguidores().size(); i++){
                        if(conta2.getSeguindo().get(i).equals(seguido)){
                             existe = true;
                        }
                    }
                    if(existe == true){
                        throw new PJSException(seguidor);
                    } else {
                        conta1.addSeguidor(seguidor);
                        conta2.addSeguindo(seguido);
                        try {
                            repositorio.atualizar(conta1);
                            repositorio.atualizar(conta2);
                        } catch (UNCException ex) {
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }

    @Override //OK
    public int numeroSeguidor(String usuario) throws PIException, PDException {
        Perfil conta = repositorio.buscar(usuario);
        if(conta == null){
            throw new PIException(usuario);
        } else{
            if(conta.isAtivo()){
                return (conta.getSeguidores()).size();
            } else {
                throw new PDException(usuario);
            }
        }
    }

    @Override //OK
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException {
        Perfil conta = repositorio.buscar(usuario);
        if(conta == null){
            throw new PIException(usuario);
        } else{
            if(conta.isAtivo()){
                int i = 0;
                Vector<Perfil> vetor = new Vector<Perfil>();
                while(i < conta.getSeguidores().size()){
                    vetor.add(repositorio.buscar(conta.getSeguidores().get(i)));
                    i++;
                }
                return vetor;
            } else {
                throw new PDException(usuario);
            }
        }
    }
    
    public Tweet[] mostrar(Vector<Tweet> tweets){
        int i = 0, j = 0;
        Tweet[] vetor = new Tweet[tweets.size()];
        while(j < tweets.size()){
            vetor[j] = tweets.get(j);
            j++;
        }
        Arrays.sort(vetor, new Sortbydate());
        return vetor;
    }
    
    class Sortbydate implements Comparator<Tweet>{ 
        public int compare(Tweet a, Tweet b) { 
            if((a.getHora()).before(b.getHora())){
                return 1;
            } else{
                return -1;
            }
        } 
    } 
}

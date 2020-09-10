package mytwitter;

import mytwitter.repositorio.IRepositorioUsuario;
import mytwitter.repositorio.Repositorio;
import mytwitter.perfil.tweet.Tweet;
import mytwitter.perfil.Perfil;
import mytwitter.perfil.PessoaFisica;
import java.util.Vector;

public class MyTwitter implements ITwitter{
    
    private IRepositorioUsuario repositorio;
    
    public void MyTwitter(){
        this.repositorio =  new Repositorio();
    }
    
     public IRepositorioUsuario getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(IRepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }
    
    @Override
    public void criarPerfil(Perfil usuario) {
        repositorio.cadastrar(usuario);
    }

    @Override
    public void cancelarPerfil(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        conta.setAtivo(false);
        //Implementar as exceções aqui 
    }

    @Override
    public void tweetar(String usuario, String mensagem) {
        Perfil conta = repositorio.buscar(usuario);
        Tweet novo = new Tweet();
        novo.setMensagem(mensagem);
        novo.setUsuario(usuario);
        conta.addTweet(novo);
    }

    @Override
    public Vector<Tweet> timeline(String usuario) {
         Perfil conta = repositorio.buscar(usuario);
         return conta.getTimeline();
         //Implementar as exceções aqui 
    }

    @Override
    public Vector<Tweet> tweets(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        return conta.getTimeline();
        //Implementar as exceções aqui 
        //Tirar dúvida sobre esses dois métodos
    }

    @Override
    public void seguir(String seguidor, String seguido) {
        Perfil conta = repositorio.buscar(seguido);
        conta.addSeguidor(seguidor);
    }

    @Override
    public int numeroSeguidor(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        return (conta.getSeguidores()).size();
        //Implementar as exceções aqui 
    }

    @Override
    public Vector<Perfil> seguidores(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        int i = 0;
        Vector<Perfil> vetor = new Vector<Perfil>();
        while(i < conta.getSeguidores().size()){
            vetor.add(repositorio.buscar(conta.getSeguidores().get(i)));
            i++;
        }
        return vetor;
    }
    
     public static void main(String[] args){
        System.out.println("MyTwitter");
        MyTwitter rep = new MyTwitter();
        PessoaFisica anderson = new PessoaFisica("Anderson");
        rep.criarPerfil(anderson);
    }
}

package mytwitter;

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
    
    @Override //OK
    public void criarPerfil(Perfil usuario) { // Não está funcionando
        repositorio.cadastrar(usuario);
    }

    @Override //OK
    public void cancelarPerfil(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        if(conta == null){
            System.out.println("CONTA NÃO EXISTE!!!!!!");
        } else{
            conta.setAtivo(false);
            System.out.println("Conta de " + conta.getUsuario() + " cancelada.");
            System.out.println("Ativo: " + conta.isAtivo());
        }
        //Implementar as exceções aqui 
    }

    @Override
    public void tweetar(String usuario, String mensagem) {
        Perfil conta = repositorio.buscar(usuario);
        Tweet novo = new Tweet();
        novo.setMensagem(mensagem);
        novo.setUsuario(usuario);
        novo.setData();
        conta.addTweet(novo);
    }

    @Override //OK*
    public Vector<Tweet> timeline(String usuario) { 
        Perfil conta = repositorio.buscar(usuario);
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
        //Ordenar os tweets aqui.
        return mural;
         //Implementar as exceções aqui 
    }

    @Override //OK
    public Vector<Tweet> tweets(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        return conta.getTimeline();
        //Implementar as exceções aqui 
        //Tirar dúvida sobre esses dois métodos
    }

    @Override //OK 
    public void seguir(String seguidor, String seguido) {
        Perfil conta1 = repositorio.buscar(seguido);
        Perfil conta2 = repositorio.buscar(seguidor);
        if(conta1 != null && conta2 != null){
            conta1.addSeguidor(seguidor);
            conta2.addSeguindo(seguido);
            System.out.println(conta1.getSeguidores()); //só para testes
        } else{
            System.out.println("HÁ UM ERRO COM ALGUM DOS DOIS NOMES!!!!");
        }
    }

    @Override //OK
    public int numeroSeguidor(String usuario) {
        Perfil conta = repositorio.buscar(usuario);
        return (conta.getSeguidores()).size();
        //Implementar as exceções aqui 
    }

    @Override //OK
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
    
    public void mostrar(Vector<Tweet> tweets){
        int i = 0, j = 0;
        Tweet[] vetor = new Tweet[tweets.size()];
        while(j < tweets.size()){
            vetor[j] = tweets.get(j);
            j++;
        }
        Arrays.sort(vetor, new Sortbydate());
        System.out.println("\nTimeline: ");
        while(i < tweets.size()){
            System.out.println(vetor[i].getMensagem());
            System.out.println("HORA: "+ vetor[i].getHora().get(Calendar.HOUR_OF_DAY) + ":" + vetor[i].getHora().get(Calendar.MINUTE)+ ":" + vetor[i].getHora().get(Calendar.SECOND));
            System.out.println("DATA: "+ vetor[i].getHora().get(Calendar.DAY_OF_MONTH) + "/" + vetor[i].getHora().get(Calendar.MONTH)+ "/" + vetor[i].getHora().get(Calendar.YEAR) + "\n");
            i++;
        }
    }
    
    public void mostraSeguidores(Vector<Perfil> pessoas){
        int i = 0;
        System.out.println("Timeline: ");
        while(i < pessoas.size()){
            System.out.println(pessoas.get(i).getUsuario());
            i++;
        }
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

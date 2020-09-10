package mytwitter;

import mytwitter.perfil.tweet.Tweet;
import mytwitter.perfil.Perfil;
import java.util.Vector;

public interface ITwitter {
    public void criarPerfil(Perfil usuario);
    
    public void cancelarPerfil(String usuario);
    
    public void tweetar(String usuario, String mensagem);
    
    public Vector<Tweet> timeline(String usuario);
    
    public Vector<Tweet> tweets(String usuario);
    
    public void seguir(String seguidor, String seguido);
    
    public int numeroSeguidor(String usuario);
    
    public Vector<Perfil> seguidores(String usuario);
}

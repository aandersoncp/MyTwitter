package mytwitter;

import excecoes.MFPException;
import excecoes.PDException;
import excecoes.PEException;
import excecoes.PIException;
import excecoes.SIException;
import excecoes.UJCException;
import mytwitter.perfil.tweet.Tweet;
import mytwitter.perfil.Perfil;
import java.util.Vector;

public interface ITwitter {
    
    public void criarPerfil(Perfil usuario) throws UJCException, PEException;
    
    public void cancelarPerfil(String usuario) throws PIException, PDException;
    
    public void tweetar(String usuario, String mensagem) throws PIException, MFPException;
    
    public Vector<Tweet> timeline(String usuario) throws PIException, PDException;
    
    public Vector<Tweet> tweets(String usuario) throws PIException, PDException;
    
    public void seguir(String seguidor, String seguido) throws PIException, PDException, SIException;
    
    public int numeroSeguidor(String usuario) throws PIException, PDException;
    
    public Vector<Perfil> seguidores(String usuario) throws PIException, PDException;
}

package mytwitter.perfil;

import java.util.Vector;
import mytwitter.perfil.tweet.Tweet;

public abstract class Perfil {
    private String usuario;
    private Vector<String> seguidores;
    private Vector<Tweet> timeline;
    private boolean ativo;
   
    public Perfil(String usuario) {
        this.usuario = usuario;
        this.seguidores = new Vector<String>();
        this.timeline = new Vector<Tweet>();
        this.ativo = true;
    }
    
    public void addSeguidor(String usuario){
        seguidores.add(usuario);
    }
    
    public void addTweet(Tweet tweet){
        timeline.add(tweet);
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Vector<String> getSeguidores() {
        return seguidores;
    }

    public Vector<Tweet> getTimeline() {
        return timeline;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}

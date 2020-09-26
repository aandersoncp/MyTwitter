package mytwitter.perfil;

import java.util.Vector;
import mytwitter.perfil.tweet.Tweet;

public abstract class Perfil {
    private String usuario;
    private Vector<String> seguidores;
    private Vector<String> seguindo; //Vector que guarda os seguidores do perfil, ajuda na obtenção da timeline (todos os tweets dos perfis seguidos) do perfil
    private Vector<Tweet> timeline;
    private boolean ativo;
   
    public Perfil(String usuario) {
        this.usuario = "@" + usuario;
        this.seguidores = new Vector<String>();
        this.seguindo = new Vector<String>();
        this.timeline = new Vector<Tweet>();
        this.ativo = true;
    }

    public Vector<String> getSeguindo() {
        return seguindo;
    }
    
    public void addSeguidor(String usuario){
        seguidores.add(usuario);
    }
    
     public void addSeguindo(String usuario){
        seguindo.add(usuario);
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

    public void setAtivo(boolean valor) {
        this.ativo = valor;
    }
    
}

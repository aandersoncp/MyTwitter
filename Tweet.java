package mytwitter.perfil.tweet;

import java.util.Calendar;
import java.util.Date;

public class Tweet {
    private String usuario;
    private String mensagem;
    private Calendar hora; //quando um novo tweet é criado, registramos a hora e a data nesse atributo 

    public Tweet() {
        this.hora = Calendar.getInstance();
    }

    public Calendar getHora() {
        return hora;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

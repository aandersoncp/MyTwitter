package mytwitter.perfil.tweet;

import java.util.Calendar;
import java.util.Date;

public class Tweet {
    private String usuario;
    private String mensagem;
    private Date data;
    private Calendar hora;

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

    public Date getData() {
        return data;
    }

    public void setData() {
        this.data = new Date();
    }
    
    public void ordenar(){
        
    }
}

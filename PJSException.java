package excecoes;

public class PJSException extends Exception{
    private String usuario;
    
    public PJSException(String usuario) {
        super("Perfil já seguido!");
        this.usuario = usuario;
    }
    
    public String nomeUsuario(){
        return usuario;
    }
}

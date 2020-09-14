package excecoes;

public class SIException extends Exception{
    private String usuario;
    public SIException(String usuario) {
        super("Seguidor e seguidos são a mesma conta!");
        this.usuario = usuario;
    }
    
    public String nomeUsuario(){
        return usuario;
    }
}

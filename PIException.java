package excecoes;

public class PIException extends Exception{
    private String usuario;

    public PIException(String usuario) {
        super("Conta inexistente!");
        this.usuario = usuario;
    }
    
    public String nomeUsuario(){
        return usuario;
    }
}

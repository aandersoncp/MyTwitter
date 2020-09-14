package excecoes;

public class PDException extends Exception{
    private String usuario;

    public PDException(String usuario) {
        super("Conta desativada");
        this.usuario = usuario;
    }
    
     public String nomeUsuario(){
        return usuario;
    }
}

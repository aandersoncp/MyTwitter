package excecoes;

public class UJCException extends Exception {
    private String usuario;

    public UJCException(String usuario) {
        super("Conta já cadastrada!");
        this.usuario = usuario;
    }
    
    public String nomeUsuario(){
        return usuario;
    }
}

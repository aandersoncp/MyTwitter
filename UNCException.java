package excecoes;

public class UNCException extends Exception{
    private String usuario;

    public UNCException(String usuario) {
        super("Conta não cadastrada!");
        this.usuario = usuario;
    }
    
    public String nomeUsuario(){
        return usuario;
    }
}

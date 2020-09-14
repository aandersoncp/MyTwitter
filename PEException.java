package excecoes;

public class PEException extends Exception{
    private String usuario;

    public PEException(String usuario) {
        super("Nome de usuário existente!");
        this.usuario = usuario;
    }
    
    public String nomeUsuario(){
        return usuario;
    }
}

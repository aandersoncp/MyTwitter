package excecoes;

public class MFPException extends Exception{

    public MFPException() {
         super("Mensagem maior de 140 caracteres!");
    }
    
}

package mytwitter.repositorio;

import excecoes.UJCException;
import excecoes.UNCException;
import mytwitter.perfil.Perfil;
import java.util.Vector;

public class Repositorio implements IRepositorioUsuario{
    //private File dados;
    private Vector<Perfil> contas;

    public Repositorio() {
        //this.dados = new File("/home/anderson/Área de Trabalho", "Twitter.txt");
        this.contas =  new Vector<Perfil>();
    }

    @Override
    public Perfil buscar(String usuario) {
        boolean achou = false;
        int i = 0;
        while(achou == false && i < contas.size()){
            if(usuario.equals(contas.get(i).getUsuario())){
                achou = true;
            } else{
                i++;
            }
        }
        if(achou){
            return contas.get(i);
        } else{
            return null;
        }
    }

    @Override
    public void atualizar(Perfil conta) throws UNCException{
        boolean achou = false;
        int i = 0;
        while(achou == false && i < contas.size()){
            if(conta.getUsuario().equals(contas.get(i).getUsuario())){
                achou = true;
            } else{
                i++;
            }
        }
        if(!achou){
            throw new UNCException(conta.getUsuario());
        } else{
            //Escrever informações do usuário no arquivo dados.
        }
    }
    
    @Override
    public void cadastrar(Perfil conta) throws UJCException{
        boolean achou = false;
        int i = 0;
        while(achou == false && i < contas.size()){
            if(conta.getUsuario().equals(contas.get(i).getUsuario())){
                achou = true;
            } else{
                i++;
            }
        }
        if(achou){
            throw new UJCException(conta.getUsuario());
        } else{
            contas.add(conta);
            System.out.println("Usuário " + conta.getUsuario() + " cadastrado.");
            //Escrever informações do usuário no arquivo dados.
        }
      
    }
    
    public void listar(){
        int i = 0;
        while(i < contas.size()){
            System.out.println("Usuário: " + contas.get(i).getUsuario());
            i++;
        }
    }

    
}

package mytwitter.repositorio;

import excecoes.UJCException;
import excecoes.UNCException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import mytwitter.perfil.Perfil;
import java.util.Vector;
import mytwitter.perfil.PessoaFisica;
import mytwitter.perfil.PessoaJuridica;

public class Repositorio implements IRepositorioUsuario{
    private File dados;
    private Vector<Perfil> contas;

    public Repositorio() {
        this.dados = new File("/home/anderson/Área de Trabalho", "Twitter.txt");
        this.contas =  new Vector<Perfil>();
    }

    public Vector<Perfil> getContas() {
        return contas;
    }

    public void setContas(Vector<Perfil> contas) {
        this.contas = contas;
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
       if(buscar(conta.getUsuario())!= null){
            for(int i = 0; i < contas.size(); i++){
                if((contas.get(i).getUsuario()).equals(conta.getUsuario())){
                    if(i == 0){
                        gravar(conta, false);
                    } else {
                        gravar(conta, true);
                    }
                } else {
                    if(i == 0){
                        gravar(contas.get(i), false);
                    } else {
                        gravar(contas.get(i), true);
                    }
                } 
            }
        } else {
             throw new UNCException(conta.getUsuario());
        }
    }
    
    @Override
    public void cadastrar(Perfil conta) throws UJCException{
        if(buscar(conta.getUsuario()) != null){
            throw new UJCException(conta.getUsuario());
        } else{
            contas.add(conta);
            System.out.println("Usuário " + conta.getUsuario() + " cadastrado.");
            if(contas.size() == 1){
                gravar(conta, false);
            } else{
                gravar(conta, true);
            }
        }
    }
    
    private void gravar(Perfil conta, boolean b){
        try {
            FileWriter arquivo = new FileWriter(dados, b);
            PrintWriter gravador = new PrintWriter(arquivo);
            gravador.println(conta.getUsuario());
            for(int j = 0; j < conta.getTimeline().size(); j++){
                gravador.print("MENSAGEM: " + conta.getTimeline().get(j).getMensagem() + " HORA: " + conta.getTimeline().get(j).getHora().get(Calendar.HOUR_OF_DAY) + ":" + conta.getTimeline().get(j).getHora().get(Calendar.MINUTE) +  ":" + conta.getTimeline().get(j).getHora().get(Calendar.SECOND) + " DATA: " + conta.getTimeline().get(j).getHora().get(Calendar.DAY_OF_MONTH) + "/" + conta.getTimeline().get(j).getHora().get(Calendar.MONTH)+ "/" + conta.getTimeline().get(j).getHora().get(Calendar.YEAR) + " | ");
                if(conta.getTimeline().size() > 0 && j == conta.getTimeline().size() - 1){
                    gravador.println();
                }
            }
            gravador.println(conta.getSeguidores());
            gravador.println(conta.getSeguindo());
            gravador.println(conta.isAtivo());
            if(conta instanceof PessoaFisica){
                gravador.println(((PessoaFisica) conta).getCpf());
            } else{
                gravador.println(((PessoaJuridica) conta).getCnpj());
            }
            gravador.println();
            gravador.close();
            arquivo.close();
        } catch (IOException ioe) {
            System.out.println("Erro no arquivo.");
        }
    }
    
}

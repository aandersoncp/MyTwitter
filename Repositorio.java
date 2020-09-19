package mytwitter.repositorio;

import excecoes.UJCException;
import excecoes.UNCException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import mytwitter.perfil.Perfil;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import mytwitter.perfil.PessoaFisica;
import mytwitter.perfil.PessoaJuridica;

public class Repositorio implements IRepositorioUsuario{
    private File dados;
    private Vector<Perfil> contas;

    public Repositorio() {
        this.dados = new File("/home/anderson/Área de Trabalho", "Twitter.txt");
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
        if(achou) {
            i = 0;
            while(i < contas.size()){
                if((contas.get(i).getUsuario()).equals(conta.getUsuario())){
                    try {
                    FileWriter arquivo = new FileWriter(dados, true);
                    PrintWriter gravador = new PrintWriter(arquivo);
                    gravador.println(conta.getUsuario());
                    for(int j = 0; j < conta.getTimeline().size(); j++){
                        gravador.print("MENSAGEM: " + conta.getTimeline().get(j).getMensagem() + " HORA: " + conta.getTimeline().get(j).getHora().get(Calendar.HOUR_OF_DAY) + ":" + conta.getTimeline().get(j).getHora().get(Calendar.MINUTE) + 
                                ":" + conta.getTimeline().get(j).getHora().get(Calendar.SECOND) + " DATA: " + conta.getTimeline().get(j).getHora().get(Calendar.DAY_OF_MONTH) + "/" + conta.getTimeline().get(j).getHora().get(Calendar.MONTH)+ "/" + conta.getTimeline().get(j).getHora().get(Calendar.YEAR) + "\n");
                    }
                    gravador.println(conta.getSeguidores());
                    gravador.println(conta.getSeguindo());
                    gravador.println(conta.isAtivo());
                    if(conta instanceof PessoaFisica){
                        gravador.println(((PessoaFisica) conta).getCpf());
                    } else{
                        gravador.println(((PessoaJuridica) conta).getCnpj());
                    }
                    i++;
                    gravador.println();
                    gravador.close();
                    arquivo.close();
                    } catch (IOException ioe) {
                        System.out.println("Erro no arquivo.");
                    }
                } else {
                    try {
                    FileWriter arquivo = new FileWriter(dados, true);
                    PrintWriter gravador = new PrintWriter(arquivo);
                    gravador.println(contas.get(i).getUsuario());
                    for(int j = 0; j < contas.get(i).getTimeline().size(); j++){
                        gravador.print("MENSAGEM: " + contas.get(i).getTimeline().get(j).getMensagem() + " HORA: " + contas.get(i).getTimeline().get(j).getHora().get(Calendar.HOUR_OF_DAY) + ":" + contas.get(i).getTimeline().get(j).getHora().get(Calendar.MINUTE) + 
                                ":" + contas.get(i).getTimeline().get(j).getHora().get(Calendar.SECOND) + " DATA: " + contas.get(i).getTimeline().get(j).getHora().get(Calendar.DAY_OF_MONTH) + "/" + contas.get(i).getTimeline().get(j).getHora().get(Calendar.MONTH)+ "/" + contas.get(i).getTimeline().get(j).getHora().get(Calendar.YEAR) + " | ");
                    }
                    gravador.println();
                    gravador.println(contas.get(i).getSeguidores());
                    gravador.println(contas.get(i).getSeguindo());
                    gravador.println(contas.get(i).isAtivo());
                    if(conta instanceof PessoaFisica){
                        gravador.println(((PessoaFisica) contas.get(i)).getCpf());
                    } else{
                        gravador.println(((PessoaJuridica) contas.get(i)).getCnpj());
                    }
                    i++;
                    gravador.println();
                    gravador.close();
                    arquivo.close();
                    } catch (IOException ioe) {
                        System.out.println("Erro no arquivo.");
                    }
                } 
            }
        } else {
            try {
                throw new UJCException(conta.getUsuario());
            } catch (UJCException ex) {
                Logger.getLogger(Repositorio.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                FileWriter arquivo = new FileWriter(dados, true);
                PrintWriter gravador = new PrintWriter(arquivo);
                gravador.println(conta.getUsuario());
                for(int j = 0; j < conta.getTimeline().size(); j++){
                     gravador.print("MENSAGEM: " + conta.getTimeline().get(j).getMensagem() + " HORA: " + conta.getTimeline().get(j).getHora().get(Calendar.HOUR_OF_DAY) + ":" + conta.getTimeline().get(j).getHora().get(Calendar.MINUTE) + 
                                ":" + conta.getTimeline().get(j).getHora().get(Calendar.SECOND) + " DATA: " + conta.getTimeline().get(j).getHora().get(Calendar.DAY_OF_MONTH) + "/" + conta.getTimeline().get(j).getHora().get(Calendar.MONTH)+ "/" + conta.getTimeline().get(j).getHora().get(Calendar.YEAR) + "\n");
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
    
    public void listar(){
        int i = 0;
        while(i < contas.size()){
            System.out.println("Usuário: " + contas.get(i).getUsuario());
            i++;
        }
    }
    
    private void gravar(Perfil conta){
        try {
            FileWriter arquivo = new FileWriter(dados, true);
            PrintWriter gravador = new PrintWriter(arquivo);
            gravador.println(conta.getUsuario());
            for(int j = 0; j < conta.getTimeline().size(); j++){
                gravador.print("MENSAGEM: " + conta.getTimeline().get(j).getMensagem() + " HORA: " + conta.getTimeline().get(j).getHora().get(Calendar.HOUR_OF_DAY) + ":" + conta.getTimeline().get(j).getHora().get(Calendar.MINUTE) +  ":" + conta.getTimeline().get(j).getHora().get(Calendar.SECOND) + " DATA: " + conta.getTimeline().get(j).getHora().get(Calendar.DAY_OF_MONTH) + "/" + conta.getTimeline().get(j).getHora().get(Calendar.MONTH)+ "/" + conta.getTimeline().get(j).getHora().get(Calendar.YEAR) + "\n");
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

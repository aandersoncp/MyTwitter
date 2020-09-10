package mytwitter.repositorio;

import mytwitter.perfil.Perfil;
import mytwitter.perfil.PessoaFisica;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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
    public void atualizar(Perfil usuario) {
        System.out.println("O que você deseja atualizar?");
    }
    
    @Override
    public void cadastrar(Perfil conta) {
        contas.add(conta);
        System.out.println(conta.getUsuario() + " cadastrado");
        //Escrever informações do usuário no arquivo dados.
        }
    public static void main(String[] args){
        System.out.println("Oi");
        Repositorio rep = new Repositorio();
        PessoaFisica anderson = new PessoaFisica("Anderson");
        rep.cadastrar(anderson);
    }
    
}

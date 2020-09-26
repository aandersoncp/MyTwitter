package mytwitter;

import excecoes.MFPException;
import excecoes.PDException;
import excecoes.PEException;
import excecoes.PIException;
import excecoes.SIException;
import excecoes.UJCException;
import mytwitter.perfil.PessoaJuridica;
import mytwitter.perfil.PessoaFisica;

public class Twitter {

    public static void main(String[] args) throws InterruptedException, UJCException, PEException, PIException, MFPException, PDException, SIException { // <--ATENÇÃO PRA ISSO AQUI
        MyTwitter rede = new MyTwitter();
        PessoaFisica anderson = new PessoaFisica("Anderson");
        //PessoaFisica teste = new PessoaFisica("Anderson");
        PessoaFisica antonio = new PessoaFisica("Antonio");
        PessoaFisica costa = new PessoaFisica("Costa");
        PessoaFisica fulano = new PessoaFisica("Fulano");
        PessoaJuridica google = new PessoaJuridica("Google");
        try{
            rede.criarPerfil(anderson);
        } catch(PEException e1){
            System.out.println("Já existe um usuário com esse nome!");
        }
        try{
            rede.criarPerfil(antonio);
        } catch(PEException e1){
            System.out.println("Já existe um usuário com esse nome!");
        }
        rede.tweetar("Anderson", "Teste 2");
        //rede.criarPerfil(teste);
        System.out.println("Terminou");
        rede.tweetar("Anderson", "Teste 1");
        new Thread().sleep(1000);
        rede.criarPerfil(fulano);
        rede.criarPerfil(costa);
        rede.criarPerfil(google);
        System.out.println("\n");
        try{
            rede.tweetar("Anderson" ,"----------------------------------------------------------------------------------------------------------------------------------------------------");
        } catch(PIException e){
            System.out.println("Perfil inexistente!!!");
        } catch(MFPException e){
            System.out.println("Mensagem fora do padrão!!!");
        } 
        new Thread().sleep(2000);
        rede.mostrar(rede.tweets("Anderson"));
        rede.seguir("Anderson", "Fulano");
        rede.seguir("Costa", "Fulano");
        System.out.println(rede.numeroSeguidor("Fulano"));
        
        rede.tweetar("Anderson", "Teste 3");
        new Thread().sleep(2000);
        rede.tweetar("Fulano", "Teste para seguidores");
        new Thread().sleep(1000);
        rede.mostrar(rede.timeline("Anderson"));
    }
    
}

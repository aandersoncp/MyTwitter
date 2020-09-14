package mytwitter;

import mytwitter.perfil.PessoaJuridica;
import mytwitter.perfil.PessoaFisica;
import java.util.Date;

public class Twitter {

    public static void main(String[] args) throws InterruptedException { // <--ATENÇÃO PRA ISSO AQUI
        MyTwitter rede = new MyTwitter();
        PessoaFisica anderson = new PessoaFisica("Anderson");
        PessoaFisica antonio = new PessoaFisica("Antonio");
        PessoaFisica costa = new PessoaFisica("Costa");
        PessoaFisica fulano = new PessoaFisica("Fulano");
        PessoaJuridica google = new PessoaJuridica("Google");
        rede.criarPerfil(anderson);
        rede.tweetar("Anderson", "Teste 1");
        new Thread().sleep(1000);
        rede.criarPerfil(fulano);
        rede.criarPerfil(antonio);
        rede.criarPerfil(costa);
        rede.criarPerfil(google);
        System.out.println("\n");
        rede.tweetar("Anderson", "Teste 2");
        new Thread().sleep(2000);
        rede.mostrar(rede.tweets("Anderson"));
        rede.seguir("Anderson", "Fulano");
        rede.seguir("Costa", "Fulano");
        System.out.println(rede.numeroSeguidor("Fulano"));
        rede.mostraSeguidores(rede.seguidores("Fulano")); 
        rede.tweetar("Anderson", "Teste 3");
        new Thread().sleep(3000);
        rede.tweetar("Fulano", "Teste para seguidores");
        new Thread().sleep(1000);
        rede.mostrar(rede.timeline("Anderson"));
    }
    
}

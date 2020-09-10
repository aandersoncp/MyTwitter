package mytwitter;

import mytwitter.perfil.PessoaJuridica;
import mytwitter.perfil.PessoaFisica;

public class Twitter {

    public static void main(String[] args) {
        MyTwitter redeSocial = new MyTwitter();
        PessoaFisica anderson = new PessoaFisica("Anderson");
        PessoaFisica antonio = new PessoaFisica("Antonio");
        PessoaFisica costa = new PessoaFisica("Costa");
        PessoaFisica fulano = new PessoaFisica("Fulano");
        PessoaJuridica google = new PessoaJuridica("Google");
        redeSocial.criarPerfil(fulano);
        //redeSocial.criarPerfil(antonio);
        //redeSocial.criarPerfil(costa);
        //redeSocial.criarPerfil(fulano);
        //redeSocial.criarPerfil(google);
        //redeSocial.repositorio.cadastrar(fulano);
    }
    
}

package mytwitter.repositorio;

import excecoes.UJCException;
import excecoes.UNCException;
import mytwitter.perfil.Perfil;

public interface IRepositorioUsuario {

    public void cadastrar(Perfil usuario) throws UJCException;
    
    public Perfil buscar(String usuario);
    
    public void atualizar(Perfil usuario) throws UNCException;
}

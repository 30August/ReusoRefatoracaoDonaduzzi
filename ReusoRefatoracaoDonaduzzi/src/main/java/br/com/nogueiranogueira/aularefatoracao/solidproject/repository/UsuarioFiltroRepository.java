package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import java.util.List;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

public interface UsuarioFiltroRepository {
    List<Usuario> buscarPorFiltroAvançados(String nome, String email, String tipoUsuario);
}

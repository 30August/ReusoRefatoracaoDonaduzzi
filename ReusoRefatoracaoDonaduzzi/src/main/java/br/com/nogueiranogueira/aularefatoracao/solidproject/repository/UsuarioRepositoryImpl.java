package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioCrudRepository, UsuarioFiltroRepository{

    @Autowired
    private UsuarioRepository jpaRepository;

    @Override
    public Usuario salvar(Usuario usuario) {
        return jpaRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return jpaRepository.findAll();
    }

    @Override
    public void excluir(Usuario usuario) {
        jpaRepository.delete(usuario);
    }

    @Override
    public List<Usuario> buscarPorFiltroAvançados(String nome, String email, String tipoUsuario) {
        return List.of();
    }
}

package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    @Autowired
    private NotificacaoServico notificacaoServico;

    public void casastrarUsuario(Usuario usuario){
        if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório");
        }
        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        if (repository.existePorEmail(usuario.getEmail())){
            throw new RuntimeException("E-mail já cadastrado");
        }
        repository.salvar(usuario);
        notificacaoServico.enviarMenssagem(usuario);
    }   
}

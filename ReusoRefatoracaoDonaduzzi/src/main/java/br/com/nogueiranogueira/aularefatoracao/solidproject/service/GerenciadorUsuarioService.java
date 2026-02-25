package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.regra.regraUsuario;
import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerenciadorUsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final List<regraUsuario> regras;

    @Autowired
    public GerenciadorUsuarioService(UsuarioRepository usuarioRepository, List<regraUsuario> regras){
        this.usuarioRepository = usuarioRepository;
        this.regras = regras;
    }
    public Usuario criarUsuario(UsuarioDTO dto) {
        final regraUsuario regraSelecionada = regras.stream()
            .filter(r -> r.seAplica(dto.tipo()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Tipo de usuario invalido"));
        Usuario usuario = regraSelecionada.processar(dto);
        return usuarioRepository.save(usuario);
    }
}

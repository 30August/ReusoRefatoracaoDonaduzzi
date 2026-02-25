package br.com.nogueiranogueira.aularefatoracao.solidproject.regra;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

public class regraUsuarioVip implements regraUsuario{

    @Override
    public boolean seAplica(String tipo) {
        return "VIP".equalsIgnoreCase(tipo);
    }

    @Override
    public Usuario processar(UsuarioDTO dto) {
        validarEmail(dto.email());
        if(dto.idade()<18){
            throw new IllegalArgumentException("Usuário deve ser maior de idade");
        }
        Usuario usuario = new Usuario(dto.nome(), dto.email(), dto.tipo());
        usuario.setPontos(100);
        return usuario;
    }

    private void validarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
    }   
}

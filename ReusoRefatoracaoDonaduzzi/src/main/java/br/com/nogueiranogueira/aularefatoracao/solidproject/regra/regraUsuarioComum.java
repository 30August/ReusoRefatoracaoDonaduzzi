package br.com.nogueiranogueira.aularefatoracao.solidproject.regra;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

public class regraUsuarioComum implements regraUsuario{
    @Override
    public boolean seAplica(String tipo) {
        return "COMUM".equalsIgnoreCase(tipo);
    }

    @Override
    public Usuario processar(UsuarioDTO dto) {
        validarEmail(dto.email());
            Usuario usuario = new Usuario(dto.nome(), dto.email(), dto.tipo());
            usuario.setPontos(0);
            return usuario;
    }

    private void validarEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
    }
}

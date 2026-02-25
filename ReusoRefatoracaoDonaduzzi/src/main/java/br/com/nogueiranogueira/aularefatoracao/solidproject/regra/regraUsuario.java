package br.com.nogueiranogueira.aularefatoracao.solidproject.regra;

import br.com.nogueiranogueira.aularefatoracao.solidproject.dto.UsuarioDTO;
import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

public interface regraUsuario {
    boolean seAplica(String tipo);
    Usuario processar(UsuarioDTO dto);
}
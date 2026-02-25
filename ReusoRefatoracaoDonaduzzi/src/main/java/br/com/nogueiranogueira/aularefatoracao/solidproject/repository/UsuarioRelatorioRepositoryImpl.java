package br.com.nogueiranogueira.aularefatoracao.solidproject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UsuarioRelatorioRepositoryImpl implements UsuarioRelatorioRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public long contarUsuariosPorTipo(String tipoUsuario) {
        // TODO Auto-generated method stub
        return jdbcTemplate.queryForObject("SELECT count(*) FROM usuarios WHERE tipo = ?", Long.class, tipoUsuario);
    }

    @Override
    public List<Object[]> gerarRelatorioUsuariosPorTipo() {
        // TODO Auto-generated method stub
        return List.of();
    }
}

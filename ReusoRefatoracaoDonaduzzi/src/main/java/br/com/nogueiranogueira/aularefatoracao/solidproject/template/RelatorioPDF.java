package br.com.nogueiranogueira.aularefatoracao.solidproject.template;

import java.util.List;

public class RelatorioPDF extends GeradorRelatorioTemplate {
    @Override
    protected String formatarCabecalho() {
        return "--- RELATÓRIO DE ANÁLISE (PDF) ---\n";
    }

    @Override
    protected String formatarCorpo(List<String> dados) {
        StringBuilder sb = new StringBuilder();
        dados.forEach(d -> sb.append("[LINHA]: ").append(d).append("\n"));
        return sb.toString();
    }
}
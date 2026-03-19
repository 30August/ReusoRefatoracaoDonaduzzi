package br.com.nogueiranogueira.aularefatoracao.solidproject.template;

import java.util.List;

public class RelatorioCSV extends GeradorRelatorioTemplate {
    @Override
    protected String formatarCabecalho() {
        return "CPF;VALOR;STATUS\n";
    }

    @Override
    protected String formatarCorpo(List<String> dados) {
        return String.join("\n", dados).replace(" - ", ";") + "\n";
    }
}
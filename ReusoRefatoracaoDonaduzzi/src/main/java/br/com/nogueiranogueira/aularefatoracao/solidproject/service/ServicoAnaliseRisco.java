package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

public interface ServicoAnaliseRisco {
    boolean avaliarCredito(String documento);
}

class SOAPAnaliseCreditoService {
    public String verificarRiscoFinanceiro(String doc) {
        return doc.length() > 11 ? "LOW_RISK" : "HIGH_RISK";
    }
}
package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

public class AnaliseRiscoAdapter implements ServicoAnaliseRisco {
    private final SOAPAnaliseCreditoService soapService;

    public AnaliseRiscoAdapter() {
        this.soapService = new SOAPAnaliseCreditoService();
    }

    @Override
    public boolean avaliarCredito(String documento) {
        String resultado = soapService.verificarRiscoFinanceiro(documento);
        return "LOW_RISK".equalsIgnoreCase(resultado);
    }
}
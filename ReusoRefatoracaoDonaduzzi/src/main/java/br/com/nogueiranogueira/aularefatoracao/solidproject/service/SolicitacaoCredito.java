package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

public record SolicitacaoCredito(String nome, double valor, String documento) {
    
    public SolicitacaoCredito {
        if (documento == null || documento.isBlank()) {
            throw new IllegalArgumentException("Documento não pode ser nulo ou vazio.");
        }
        // Validação simples de tamanho para CPF (11) ou CNPJ (14)
        if (documento.length() != 11 && documento.length() != 14) {
             throw new IllegalArgumentException("Documento inválido. Deve conter 11 (CPF) ou 14 (CNPJ) dígitos.");
        }
    }

    public boolean isCnpj() {
        return documento.length() == 14;
    }
}
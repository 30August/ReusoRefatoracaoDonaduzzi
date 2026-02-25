package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioMailSenderService {

    private final EmailService emailService;
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioMailSenderService(EmailService emailService, UsuarioRepository usuarioRepository) {
        this.emailService = emailService;
        this.usuarioRepository = usuarioRepository;
    }

    public void enviarEmailBoasVindas(String email) {
        // Lógica para enviar email de boas-vindas
        String assunto = "Bem-vindo ao nosso sistema!";
        String mensagem = "Olá! Obrigado por se cadastrar em nosso sistema.";
        emailService.sendEmail(assunto, assunto, mensagem);
    }
}

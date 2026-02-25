package br.com.nogueiranogueira.aularefatoracao.solidproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.nogueiranogueira.aularefatoracao.solidproject.model.Usuario;

@Service
public class NotificacaoServico {
    @Autowired
    private JavaMailSender mailSender;

    public void enviarMenssagem(Usuario usuario){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(usuario.getEmail());
        message.setSubject("Bem-vindo!");
        message.setText("Olá " + usuario.getNome() + ", seu cadastro foi realizado com sucesso.");
        if (mailSender != null) {
            mailSender.send(message);
        }
    }
}

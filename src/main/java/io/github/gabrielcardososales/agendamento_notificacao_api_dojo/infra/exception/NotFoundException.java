package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}

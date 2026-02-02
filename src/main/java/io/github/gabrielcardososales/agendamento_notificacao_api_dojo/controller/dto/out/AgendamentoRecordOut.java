package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.out;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.enums.StatusNoficacaoEnum;

import java.time.LocalDateTime;

public record AgendamentoRecordOut(
        Long id,
        String emailDestinatario,
        String telefoneDestinatario,
        String mensagem,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd:HH:yyyy HH:mm:ss")
        LocalDateTime dataHoraEnvio,
        StatusNoficacaoEnum statusNoficacao
)
{}

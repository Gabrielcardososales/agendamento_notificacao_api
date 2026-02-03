package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.entities;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "agendamento")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailDestinatario;

    private String telefoneDestinatario;

    private LocalDateTime dataHoraEnvio;

    private LocalDateTime dataHoraAgendamento;

    private LocalDateTime dataHoraModificacao;

    private String mensagem;

    private StatusNotificacaoEnum statusNotificacao;

    @PrePersist
    private void prePersist(){
        dataHoraAgendamento = LocalDateTime.now();
        statusNotificacao = StatusNotificacaoEnum.AGENDADO;
    }
}

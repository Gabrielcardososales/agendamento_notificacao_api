package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.entities;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.enums.StatusNoficacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "agendamento")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String emailDestinatario;

    private String telefone;

    private LocalDateTime dataHoraEnvio;

    private LocalDateTime dataHoraAgendamento;

    private LocalDateTime dataHoraModificacao;

    private String mensagem;

    private StatusNoficacaoEnum statusNoficacao;

    @PrePersist
    private void prePersist(){
        dataHoraAgendamento = LocalDateTime.now();
        statusNoficacao = StatusNoficacaoEnum.AGENDADO;
    }
}

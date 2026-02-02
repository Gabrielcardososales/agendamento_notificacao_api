package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.repositories;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{
}

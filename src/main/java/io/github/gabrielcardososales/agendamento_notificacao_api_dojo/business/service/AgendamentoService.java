package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.service;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.mapper.IAgendamentoMapper;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.in.AgendamentoRecord;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.out.AgendamentoRecordOut;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    private final IAgendamentoMapper mapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamentoRecord){
        var agendamento = repository
                .save(mapper
                        .paraEntidade(agendamentoRecord));

        return mapper.paraOut(agendamento);
    }
}

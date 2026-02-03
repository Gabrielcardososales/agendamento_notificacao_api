package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.service;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.mapper.IAgendamentoMapper;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.in.AgendamentoRecord;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.out.AgendamentoRecordOut;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.entities.Agendamento;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.exception.NotFoundException;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    private final IAgendamentoMapper mapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamentoRecord){
        System.out.println( mapper.paraEntidade(agendamentoRecord));

        Agendamento agendamento = repository
                .save(mapper
                        .paraEntidade(agendamentoRecord));


        return mapper.paraOut(agendamento);
    }

    public AgendamentoRecordOut buscarAgendamentosPorId(Long id){
        Agendamento agendamento = repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Id não encontrado"));
        return mapper.paraOut(agendamento);
    }
}

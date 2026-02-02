package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.mapper;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.in.AgendamentoRecord;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.out.AgendamentoRecordOut;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.entities.Agendamento;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntidade(AgendamentoRecord agendamentoRecord);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}

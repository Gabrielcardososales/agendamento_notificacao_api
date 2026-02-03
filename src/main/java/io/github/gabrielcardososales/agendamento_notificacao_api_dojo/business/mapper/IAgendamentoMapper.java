package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.mapper;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.in.AgendamentoRecord;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.out.AgendamentoRecordOut;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.infra.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR
)

public interface IAgendamentoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataHoraAgendamento", ignore = true)
    @Mapping(target = "dataHoraModificacao", ignore = true)
    @Mapping(target = "statusNotificacao", ignore = true)
    Agendamento paraEntidade(AgendamentoRecord agendamentoRecord);

    AgendamentoRecordOut paraOut(Agendamento agendamento);
}
package io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller;

import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.business.service.AgendamentoService;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.in.AgendamentoRecord;
import io.github.gabrielcardososales.agendamento_notificacao_api_dojo.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamentoRecord){
        log.info("Començando o processamento lindo aqui");

        return ResponseEntity.ok(service.gravarAgendamento(agendamentoRecord));
    }

    @GetMapping("{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendammentoPorId(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarAgendamentosPorId(id));
    }
}

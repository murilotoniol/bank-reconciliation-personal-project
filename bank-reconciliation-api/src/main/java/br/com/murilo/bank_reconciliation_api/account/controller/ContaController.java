package br.com.murilo.bank_reconciliation_api.account.controller;

import br.com.murilo.bank_reconciliation_api.account.service.ContaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController {

    private final ContaService contaService;

    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }
}

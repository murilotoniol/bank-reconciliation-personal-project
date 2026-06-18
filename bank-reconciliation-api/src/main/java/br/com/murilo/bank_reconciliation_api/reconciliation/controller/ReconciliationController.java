package br.com.murilo.bank_reconciliation_api.reconciliation.controller;

import br.com.murilo.bank_reconciliation_api.reconciliation.service.ReconciliationService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReconciliationController {

    private final ReconciliationService reconciliationService;

    public ReconciliationController(ReconciliationService reconciliationService) {
        this.reconciliationService = reconciliationService;
    }
}

package br.com.murilo.bank_reconciliation_api.transaction.controller;

import br.com.murilo.bank_reconciliation_api.transaction.service.TransactionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController (TransactionService transactionService) {
        this.transactionService = transactionService;
    }
}

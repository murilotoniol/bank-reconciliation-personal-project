package br.com.murilo.bank_reconciliation_api.account.controller;

import br.com.murilo.bank_reconciliation_api.account.service.AccountService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
}

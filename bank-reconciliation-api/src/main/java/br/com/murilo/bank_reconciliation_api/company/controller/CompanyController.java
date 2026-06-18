package br.com.murilo.bank_reconciliation_api.company.controller;

import br.com.murilo.bank_reconciliation_api.company.service.CompanyService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController (CompanyService companyService) {
        this.companyService = companyService;
    }
}

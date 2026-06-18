package br.com.murilo.bank_reconciliation_api.company.service;

import br.com.murilo.bank_reconciliation_api.company.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl (CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
}

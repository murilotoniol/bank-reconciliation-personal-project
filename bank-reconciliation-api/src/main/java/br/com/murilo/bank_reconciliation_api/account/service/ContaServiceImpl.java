package br.com.murilo.bank_reconciliation_api.account.service;

import br.com.murilo.bank_reconciliation_api.account.repository.ContaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaServiceImpl implements ContaService {

    private final ContaRepository contaRepository;

    public ContaServiceImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }
}

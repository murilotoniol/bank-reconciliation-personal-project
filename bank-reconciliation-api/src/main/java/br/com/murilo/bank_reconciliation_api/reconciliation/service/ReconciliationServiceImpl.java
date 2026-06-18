package br.com.murilo.bank_reconciliation_api.reconciliation.service;

import br.com.murilo.bank_reconciliation_api.reconciliation.repository.ReconciliationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReconciliationServiceImpl implements ReconciliationService {

    private final ReconciliationRepository reconciliationRepository;

    public ReconciliationServiceImpl(ReconciliationRepository reconciliationRepository) {
        this.reconciliationRepository = reconciliationRepository;
    }
}
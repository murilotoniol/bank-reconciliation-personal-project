package br.com.murilo.bank_reconciliation_api.transaction.service;

import br.com.murilo.bank_reconciliation_api.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl (TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
}

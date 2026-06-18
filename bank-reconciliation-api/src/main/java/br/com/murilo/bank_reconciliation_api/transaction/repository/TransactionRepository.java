package br.com.murilo.bank_reconciliation_api.transaction.repository;

import br.com.murilo.bank_reconciliation_api.transaction.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}

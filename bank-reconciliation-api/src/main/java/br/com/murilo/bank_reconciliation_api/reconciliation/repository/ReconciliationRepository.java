package br.com.murilo.bank_reconciliation_api.reconciliation.repository;

import br.com.murilo.bank_reconciliation_api.reconciliation.entity.Reconciliation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReconciliationRepository extends JpaRepository<Reconciliation, UUID> {
}

package br.com.murilo.bank_reconciliation_api.account.repository;

import br.com.murilo.bank_reconciliation_api.account.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContaRepository extends JpaRepository<Conta, UUID>{
}

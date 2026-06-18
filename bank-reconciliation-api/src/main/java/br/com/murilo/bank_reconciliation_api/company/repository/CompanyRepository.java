package br.com.murilo.bank_reconciliation_api.company.repository;

import br.com.murilo.bank_reconciliation_api.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {
}

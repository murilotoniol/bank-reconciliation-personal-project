package br.com.murilo.bank_reconciliation_api.company.repository;

import br.com.murilo.bank_reconciliation_api.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyRepository extends JpaRepository<Company, UUID> {
}

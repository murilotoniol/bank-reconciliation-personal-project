package br.com.murilo.bank_reconciliation_api.reconciliation.entity;

import br.com.murilo.bank_reconciliation_api.reconciliation.dto.ReconciliationResult;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbReconciliation")
@Getter
@Setter
@NoArgsConstructor
public class Reconciliation {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "processing_date", nullable = false)
    private LocalDateTime processingDate;

    @Column(name = "imported_file", nullable = false)
    private String importedFile;

    @Enumerated(EnumType.STRING)
    @Column(name = "result", nullable = false)
    private ReconciliationResult result;
}

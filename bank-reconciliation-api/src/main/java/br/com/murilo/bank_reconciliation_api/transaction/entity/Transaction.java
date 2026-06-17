package br.com.murilo.bank_reconciliation_api.transaction.entity;

import br.com.murilo.bank_reconciliation_api.account.entity.Account;
import br.com.murilo.bank_reconciliation_api.transaction.dto.TransactionStatus;
import br.com.murilo.bank_reconciliation_api.transaction.dto.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tbTransaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TransactionType type;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TransactionStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payer_id", nullable = false)
    private Account payer;

    @ManyToOne
    @JoinColumn(name = "beneficiary_id", nullable = false)
    private Account beneficiary;

}

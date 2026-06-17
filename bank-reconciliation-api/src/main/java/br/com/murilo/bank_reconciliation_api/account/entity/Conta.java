package br.com.murilo.bank_reconciliation_api.account.entity;

import br.com.murilo.bank_reconciliation_api.company.entity.Empresa;
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
@Table(name = "tbConta", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"empresa_id", "nome_banco", "agencia", "conta"})
})
public class Conta {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "nome_banco", nullable = false)
    private String nomeBanco;

    @Column(name = "agencia", nullable = false)
    private Integer agencia;

    @Column(name = "conta", nullable = false)
    private Integer conta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

    @Column(name = "saldo_atual")
    private BigDecimal saldoAtual;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

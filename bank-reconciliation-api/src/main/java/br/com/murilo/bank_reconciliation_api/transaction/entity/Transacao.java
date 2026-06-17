package br.com.murilo.bank_reconciliation_api.transaction.entity;

import br.com.murilo.bank_reconciliation_api.account.entity.Conta;
import br.com.murilo.bank_reconciliation_api.transaction.dto.TransacaoStatus;
import br.com.murilo.bank_reconciliation_api.transaction.dto.TransacaoTipo;
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
@Table(name = "tbTransacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TransacaoTipo tipo;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @Column(name = "data", nullable = false)
    private LocalDateTime data;

    @Column(name = "descricao")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TransacaoStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pagador_id", nullable = false)
    private Conta pagador;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id", nullable = false)
    private Conta beneficiario;

}

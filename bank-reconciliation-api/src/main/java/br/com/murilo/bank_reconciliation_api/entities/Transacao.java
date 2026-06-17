package br.com.murilo.bank_reconciliation_api.entities;

import br.com.murilo.bank_reconciliation_api.enums.TransacaoStatus;
import br.com.murilo.bank_reconciliation_api.enums.TransacaoTipo;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbTransacao")
public class Transacao {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "data", nullable = false, unique = true)
    private LocalDateTime data;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "pagador_id", nullable = false)
    private Conta pagador;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id", nullable = false)
    private Conta beneficiario;

    @Column(name = "tipo")
    private TransacaoTipo tipo;

    @Column(name = "status")
    private TransacaoStatus status;

}

package br.com.murilo.bank_reconciliation_api.entities;

import br.com.murilo.bank_reconciliation_api.enums.TransacaoStatus;
import br.com.murilo.bank_reconciliation_api.enums.TransacaoTipo;
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

    @Column(name = "data", nullable = false)
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

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TransacaoTipo tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TransacaoStatus status;

}

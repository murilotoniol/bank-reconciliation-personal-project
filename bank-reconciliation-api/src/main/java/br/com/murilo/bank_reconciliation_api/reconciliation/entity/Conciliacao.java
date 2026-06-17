package br.com.murilo.bank_reconciliation_api.reconciliation.entity;

import br.com.murilo.bank_reconciliation_api.reconciliation.dto.ResultadoConciliacao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbConciliacao")
@Getter
@Setter
@NoArgsConstructor
public class Conciliacao {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "data_processamento", nullable = false)
    private LocalDateTime dataProcessamento;

    @Column(name = "arquivo_importado", nullable = false)
    private String arquivoImportado;

    @Enumerated(EnumType.STRING)
    @Column(name = "resultado", nullable = false)
    private ResultadoConciliacao resultado;
}

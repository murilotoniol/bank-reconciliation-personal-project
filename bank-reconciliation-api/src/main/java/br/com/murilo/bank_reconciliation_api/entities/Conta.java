package br.com.murilo.bank_reconciliation_api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Conta {

    @Id
    @Column
    private UUID id;

    @Column
    private String nome;

    @Column
    private String cnpj;

    @Column
    private BigDecimal saldoInterno;
}

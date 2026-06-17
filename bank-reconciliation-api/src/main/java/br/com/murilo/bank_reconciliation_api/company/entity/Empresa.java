package br.com.murilo.bank_reconciliation_api.company.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tbEmpresa")
@Getter
@Setter
@NoArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cnpj", nullable = false, unique = true, length = 14)
    private String cnpj;
}

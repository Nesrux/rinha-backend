package com.nesrux.rinhabackend.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cliente")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    private Long id;

    private Integer limite;

    @Column(name = "saldo_inicial")
    private BigDecimal saldoInicial;


    @OneToMany(mappedBy = "cliente", orphanRemoval = true)
    private Set<Transacao> transacoes = new LinkedHashSet<>();

}

package com.nesrux.rinhabackend.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cliente", indexes = @Index(name = "idx_id", columnList = "id"))
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    private Long id;

    @OneToMany(mappedBy = "cliente", orphanRemoval = true)
    private Set<Transacao> transacoes = new LinkedHashSet<>();

    @OneToOne(mappedBy = "cliente", orphanRemoval = true)
    private Saldo saldo;

}

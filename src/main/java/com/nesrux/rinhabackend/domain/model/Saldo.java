package com.nesrux.rinhabackend.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "saldo")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Saldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @OneToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_saldo_cliente"))
    private Cliente cliente;

    private Integer saldo;

    private Integer limite;


}

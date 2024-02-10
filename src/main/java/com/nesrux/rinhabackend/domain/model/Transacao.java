package com.nesrux.rinhabackend.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacao")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transacao {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor", nullable = false)
    private BigDecimal valorTransacao;

    @Column(length = 10, nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_transacao", nullable = false, length = 1)
    private TipoTransacao tipoTransacao;

    @Column(name = "realizada_em", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime realizadaEm;

    @ManyToOne
    @JoinColumn(name = "cliente_id",
            foreignKey = @ForeignKey(name = "FK_cliente_transacao"))
    private Cliente cliente;

    public enum TipoTransacao {
        C, D
        //Credito - debito
    }
}


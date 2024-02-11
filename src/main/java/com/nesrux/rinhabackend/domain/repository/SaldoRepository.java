package com.nesrux.rinhabackend.domain.repository;

import com.nesrux.rinhabackend.domain.model.Saldo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaldoRepository extends JpaRepository<Saldo, Long> {
}
package com.nesrux.rinhabackend.domain.repository;

import com.nesrux.rinhabackend.domain.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRespository extends JpaRepository<Transacao, Long> {


}

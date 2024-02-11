package com.nesrux.rinhabackend.api.dto;

import com.nesrux.rinhabackend.domain.model.Transacao;

public record TransacaoInput(Integer valor, Transacao.TipoTransacao tipoTransacao, String descricao) {
}

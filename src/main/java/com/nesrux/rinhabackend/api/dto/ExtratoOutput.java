package com.nesrux.rinhabackend.api.dto;

import com.nesrux.rinhabackend.domain.model.Saldo;
import com.nesrux.rinhabackend.domain.model.Transacao;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ExtratoOutput {

    private Saldo saldo;
    private List<Transacao> ultimasTransacoes = new ArrayList<>();
}

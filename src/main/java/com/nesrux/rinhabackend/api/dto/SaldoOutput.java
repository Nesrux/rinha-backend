package com.nesrux.rinhabackend.api.dto;

import java.time.LocalDateTime;

public record SaldoOutput(Integer total, LocalDateTime dataExtrato, Integer limite) {
}

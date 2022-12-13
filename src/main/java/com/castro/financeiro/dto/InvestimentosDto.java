package com.castro.financeiro.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InvestimentosDto{
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataAplicacao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
}

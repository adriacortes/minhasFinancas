package com.castro.financeiro.dto;


import com.castro.financeiro.orm.Status;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DespesasDto {
    // TODO Deve validar os campos usando Bean Validation
    private String descricao;
    private BigDecimal valor;
    private String formaPagamento;
    private Integer parcelas;
    private LocalDate dataVencimento;
    private Status statusPagamento;

    public Status getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(Status statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

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

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}

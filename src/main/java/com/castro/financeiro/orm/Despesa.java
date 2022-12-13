package com.castro.financeiro.orm;

import com.castro.financeiro.dto.DespesasDto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "despesa")
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String descricao;
    private BigDecimal valor;
    private  String formaDePagamento;
    private Integer parcelas;
    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    private Status statusPagamento;

    public Despesa() {}

    public Despesa(Integer id, DespesasDto dadosDespesas) {
        this.id = id;
        this.descricao = dadosDespesas.getDescricao();
        this.valor = dadosDespesas.getValor();
        this.formaDePagamento = dadosDespesas.getFormaPagamento();
        this.parcelas = dadosDespesas.getParcelas();
        this.dataVencimento = dadosDespesas.getDataVencimento();
        this.statusPagamento = dadosDespesas.getStatusPagamento();
    }

    public Despesa(DespesasDto dadosDespesas) {
        this.descricao = dadosDespesas.getDescricao();
        this.valor = dadosDespesas.getValor();
        this.formaDePagamento = dadosDespesas.getFormaPagamento();
        this.parcelas = dadosDespesas.getParcelas();
        this.dataVencimento = dadosDespesas.getDataVencimento();
        this.statusPagamento = dadosDespesas.getStatusPagamento();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
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

    public Status getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(Status statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Despesa despesa = (Despesa) o;
        return Objects.equals(id, despesa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

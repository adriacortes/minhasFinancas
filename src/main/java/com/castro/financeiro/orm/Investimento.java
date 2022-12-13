package com.castro.financeiro.orm;

import com.castro.financeiro.dto.InvestimentosDto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "investimentos")
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String descricao;
    private BigDecimal valor;
    private LocalDate dataAplicacao;

    public Investimento() {
    }

    public Investimento(InvestimentosDto dadosInvestimento) {
        this.descricao = dadosInvestimento.getDescricao();
        this.valor = dadosInvestimento.getValor();
        this.dataAplicacao = dadosInvestimento.getDataAplicacao();
    }

    public Investimento(Integer id,InvestimentosDto dadosInvestimento ) {
        this.id = id;
        this.descricao = dadosInvestimento.getDescricao();
        this.valor = dadosInvestimento.getValor();
        this.dataAplicacao = dadosInvestimento.getDataAplicacao();
    }



}
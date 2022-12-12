package com.castro.financeiro.orm;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "investimento")
public class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String descricao;
    private Double valor;

    Calendar data = Calendar.getInstance();

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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Investimento{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
package com.castro.financeiro.orm;

import javax.persistence.*;

@Entity
@Table(name = "contaspagar")
public class ContasAPagar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String descrição;
    private Double valor;
    private  String formaDePagamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "ContasAPagar{" +
                "id=" + id +
                ", descrição='" + descrição + '\'' +
                ", valor=" + valor +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                '}';
    }
}

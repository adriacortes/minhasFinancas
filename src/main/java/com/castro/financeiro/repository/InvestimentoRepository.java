package com.castro.financeiro.repository;


import com.castro.financeiro.orm.InvestimentoProjecao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.castro.financeiro.orm.Investimento;

import java.util.List;

@Repository
public interface InvestimentoRepository extends PagingAndSortingRepository<Investimento,Integer> {
/*
  CrudRepository
  PagingAndSortingRepository - Permite criar a paginação(carregamento
  mais rápido)
*/

    /* Derived Query */
    List<Investimento> findByDescricao(String descricao);
    List<Investimento> findByDescricaoStartingWith(String nome);
    List<Investimento> findByDescricaoLike(String descricao);
    List<Investimento> findByDescricaoAndValor(String descricao,Double valor);
    List<Investimento> findByDescricaoIsNull();
    List<Investimento> findByDescricaoIsNotNull();

    /*  JPQL - Querys com SQL só que utilizando o nome das entidades java*/
    @Query("SELECT i FROM Investimento i WHERE i.descricao= :descricao AND i.valor>:valor")
    List<Investimento> findDescricaoDepositoMaior(String descricao,Double valor);

    /* Usando query nativa (com campos do banco de dados
    * 1.Esqueleto da função
    * 2.@Query(value="SELECT *FROM PRODUTO WHERE PRO_ID=X",nativeQuery = true)
    * */

    /* USANDO INTERFACE PARA PESQUISAR ATRIBUTOS ESPECIFICOS*/
    @Query(value = "SELECT i.id,i.descricao,i.valor FROM INVESTIMENTO i",nativeQuery = true)
    List<InvestimentoProjecao> findIdDescricaValor();




}
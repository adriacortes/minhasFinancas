package com.castro.financeiro.repository;

import com.castro.financeiro.orm.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesasRepository extends JpaRepository<Despesa,Integer> {

}

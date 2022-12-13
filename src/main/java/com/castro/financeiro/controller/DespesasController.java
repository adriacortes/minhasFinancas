package com.castro.financeiro.controller;

import com.castro.financeiro.dto.DespesasDto;
import com.castro.financeiro.orm.Despesa;
import com.castro.financeiro.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesasController {

    @Autowired
    private DespesasRepository despesasRepository;

    @PostMapping
    public void cadastrar(@Validated @RequestBody DespesasDto dadosDespesas){
        despesasRepository.save(new Despesa(dadosDespesas));
        //System.out.println(dadosDespesas.getStatusPagamento());
    }

    @PutMapping(path = "/{id}")
    public void atualizar(@Validated @RequestBody DespesasDto despesasDto, @PathVariable Integer id){
        despesasRepository.save(new Despesa(id, despesasDto));
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Integer id){
        despesasRepository.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<Despesa>> listarTodos(){
        List<Despesa> despesas = despesasRepository.findAll();
        return ResponseEntity.ok(despesas);
    }
}

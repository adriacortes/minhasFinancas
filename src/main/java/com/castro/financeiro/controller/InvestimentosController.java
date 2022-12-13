package com.castro.financeiro.controller;

import com.castro.financeiro.dto.InvestimentosDto;
import com.castro.financeiro.orm.Despesa;
import com.castro.financeiro.orm.Investimento;
import com.castro.financeiro.repository.InvestimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/investimento")
public class InvestimentosController {

    @Autowired
    private InvestimentosRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody InvestimentosDto dadosInvestimento){
        repository.save(new Investimento(dadosInvestimento));

    }

    @PutMapping(path = "/{id}")
    public void atualizar(@RequestBody InvestimentosDto dadosInvestimento,@PathVariable Integer id){
        repository.save(new Investimento(id,dadosInvestimento));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarRegistro(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @GetMapping
    public ResponseEntity<List<Investimento>> listarTodos(){
        List<Investimento> listInvestimento = repository.findAll();
        return ResponseEntity.ok(listInvestimento);
    }

}


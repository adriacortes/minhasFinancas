package com.castro.financeiro.service;

import com.castro.financeiro.orm.Investimento;
import com.castro.financeiro.repository.InvestimentoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;


@Service
public class InvestimentoService {

    private InvestimentoRepository repository;

    public InvestimentoService(InvestimentoRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(String descricao,double valor){
        Investimento investir = new Investimento();
        investir.setDescricao(descricao);
        investir.setValor(valor);
        repository.save(investir);
        System.out.println("REGISTRO CADASTRADO COM SUCESSO!");
    }

    public void atualizar(int id,String descricao,Double valor){
        Investimento investir = new Investimento();
        investir.setId(id);
        investir.setDescricao(descricao);
        investir.setValor(valor);
        repository.save(investir);
        System.out.println("REGISTRO ATUALIZADO COM SUCESSO!");
    }

    /*UTILIZANDO PAGINAÇÃO*/
    public void listarTodosRegistros(){

        Pageable pageable = PageRequest.of(1,3,Sort.by(Sort.Direction.DESC,"descricao"));
        Page<Investimento> investimento = repository.findAll(pageable);

        System.out.println("LISTANDO REGISTROS");
     //   System.out.println(investimento);
        System.out.println("Pagina atual:" + investimento.getNumber());
        System.out.println("Total Elementos na consulta:" + investimento.getTotalElements());
        investimento.forEach(Investimento->System.out.println(Investimento));

    }

    public void deletarRegistro(int id){
        repository.deleteById(id);
        System.out.println("Deletado com sucesso!");
    }

}


package com.castro.financeiro.service;

import com.castro.financeiro.orm.Investimento;
import com.castro.financeiro.orm.InvestimentoProjecao;
import com.castro.financeiro.repository.InvestimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatoriosInvestimentoService {

    private final InvestimentoRepository repository;

    public RelatoriosInvestimentoService(InvestimentoRepository repository) {
        this.repository = repository;
    }

    public void pesquisarPorDescricao(String descricao){
        List<Investimento> listaInvestimentos = repository.findByDescricao(descricao);
        System.out.println("### RESULTADO DA PESQUISA ###");
        listaInvestimentos.forEach(Investimento-> System.out.println(Investimento));
    }
    public void pesquisarDescricaoQueComeceComAPalavra(String descricao){
        List<Investimento> listaInvestimentos;
        listaInvestimentos=repository.findByDescricaoStartingWith(descricao);
        System.out.println("### RESULTADO DA PESQUISA ###");
        listaInvestimentos.forEach(Investimento->System.out.println(Investimento));
    }
    public void pesquisarDescricaoComLike(String descricao){
        List<Investimento> list = repository.findByDescricaoLike(descricao);
        System.out.println("### RESULTADO DA PESQUISA ###");
        list.forEach(Investimento->System.out.println(Investimento));
    }
    public void pesquisarPorDescricaoEValor(String descricao,Double valor){
        List<Investimento> list = repository.findByDescricaoAndValor(descricao,valor);
        System.out.println("### RESULTADO DA PESQUISA ###");
        list.forEach(Investimento->System.out.println(Investimento));
    }

    public void pesquisarDepositoMaiorQue(String descricao,Double valor){
        List<Investimento> list = repository.findDescricaoDepositoMaior(descricao,valor);
        System.out.println("### RESULTADO DA PESQUISA ###");
        list.forEach(Investimento->System.out.println(Investimento));
    }


    public void pesquisarInvestimentoIdValor(){
        List<InvestimentoProjecao> list = repository.findIdDescricaValor();
        list.forEach(f-> System.out.println
                ("Investimento Id: "+f.getId()+" Descricao: "+f.getDescricao()+" Valor: "+ f.getValor()));
    }


}

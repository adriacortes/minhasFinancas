package com.castro.financeiro;

import com.castro.financeiro.service.InvestimentoService;
import com.castro.financeiro.service.RelatoriosInvestimentoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.castro.financeiro.orm.Investimento;

import java.util.Locale;

@SpringBootApplication
public class FinancasApplication implements CommandLineRunner {


   private InvestimentoService investimentoService;
   private RelatoriosInvestimentoService relatoriosInvestimentoService;

    public FinancasApplication(InvestimentoService investimentoService,RelatoriosInvestimentoService relatoriosInvestimentoService) {
        this.investimentoService = investimentoService;
        this.relatoriosInvestimentoService = relatoriosInvestimentoService;
    }

    public static void main(String[] args) {
        /*Faz com que o framework do Spring seja inicializado junto com a nossa aplicação*/
        SpringApplication.run(FinancasApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Investimento investimento = new Investimento();

        String descricao = "ACOES";
        String pesquisar = "FII";
        double valor = 300;
        int id = 10;

        //investimentoService.atualizar(id,descricao.toUpperCase(Locale.ROOT),valor);
        //investimentoService.cadastrar(descricao,valor);
        //investimentoService.deletarRegistro(2);
        //investimentoService.listarTodosRegistros();
      //  relatoriosInvestimentoService.pesquisarPorDescricao(pesquisar);
       // relatoriosInvestimentoService.pesquisarPorDescricaoEValor(pesquisar,valor);
        relatoriosInvestimentoService.pesquisarDepositoMaiorQue(pesquisar,valor);
        //relatoriosInvestimentoService.pesquisarInvestimentoIdValor();




    }
}

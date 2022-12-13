package com.castro.financeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancasApplication  {
    public static void main(String[] args) {
        /*Faz com que o framework do Spring seja inicializado junto com a nossa aplicação*/
        SpringApplication.run(FinancasApplication.class, args);
    }
}

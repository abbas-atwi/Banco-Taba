package com.algaworks.curso.MAIN;

import com.algaworks.curso.MODELO.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Transferencia {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoTabajaraPU");
    EntityManager em = emf.createEntityManager();
    Scanner entrada = new Scanner(System.in);
    Conta conta1 = em.find(Conta.class, 1L);
    if(conta1 == null){
        System.out.println("Digite o saldo inicial na Conta 1 : ");
        double saldoInicial = entrada.nextDouble();
        conta1 = new Conta();
        conta1.setSaldo(saldoInicial);
    }


}

package org.example;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }

    public static class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(String message){
            super(message);
        }
    }
}
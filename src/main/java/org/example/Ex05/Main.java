package org.example.Ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número e o seu expoente: ");
        Scanner sc = new Scanner(System.in);
        int resultado = 1;
        int numBase = sc.nextInt();
        int numExpoente = sc.nextInt();

        if(numExpoente == 0) {
            System.out.println("Resultado = 1");
        }else {
            for(int i = 0; i < numExpoente; i++) {
                resultado *= numBase;
            }
        }
        System.out.println("Resultado = " + resultado);
    }
}

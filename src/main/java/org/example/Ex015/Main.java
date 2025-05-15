package org.example.Ex015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("Digite o prefixo: ");
        String prefixo = sc.nextLine();
        System.out.println("Digite o sufixo: ");
        String sufixo = sc.nextLine();
        sc.close();

        if (palavra.startsWith(prefixo)) {
            System.out.println("A palavra " + palavra + " possui o prefixo " + prefixo);
        }else {
            System.out.println("A palavra " + palavra + " não possui o prefixo " + prefixo);
        }

        if (palavra.startsWith(sufixo)) {
            System.out.println("A palavra " + palavra + " possui o sufixo " + sufixo);
        }else {
            System.out.println("A palavra " + palavra + " não possui o sufixo " + sufixo);
        }
    }
}

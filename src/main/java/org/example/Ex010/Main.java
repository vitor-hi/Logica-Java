package org.example.Ex010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra para substituir por outra palavra na frase: ");
        String palavraNova = sc.nextLine();
        System.out.println("Digite a palavra que deseja remover da frase: ");
        String palavraAntiga = sc.nextLine();

        String novaFrase = frase.replace(palavraAntiga, palavraNova);
        System.out.println("Nova frase: " + novaFrase);


    }
}

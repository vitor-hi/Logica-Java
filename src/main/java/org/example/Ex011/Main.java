package org.example.Ex011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Digite um caractere para saber o númedo de ocorências na frase: ");
        String caractere = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caractere.charAt(0)) {
                cont++;
            }
        }
        System.out.println("O caractere " + caractere + " aparece " + cont + " vezes na frase.");
    }
}

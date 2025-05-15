package org.example.Ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase ou uma palavra: ");
        String frase = sc.nextLine().toLowerCase();
        String vogais = "aeiou";
        int count = 0;
        for(char c : frase.toCharArray()) {
            if(vogais.indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Quantidade de vogais: " + count);
    }
}

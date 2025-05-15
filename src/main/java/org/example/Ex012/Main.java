package org.example.Ex012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase ou palavra: ");
        String palavraFrase01 = sc.nextLine();
        System.out.println("Digite outra frase ou palavra: ");
        String palavraFrase02 = sc.nextLine();
        palavraFrase01.equalsIgnoreCase(palavraFrase02);
        System.out.println("As palavras são iguais?"+ ": " + palavraFrase01.equalsIgnoreCase(palavraFrase02));
    }
}

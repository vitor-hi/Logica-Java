package org.example.Ex016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String agrupado = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            agrupado += palavra;
        }
        System.out.println(agrupado);
    }
}

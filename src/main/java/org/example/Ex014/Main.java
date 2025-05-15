package org.example.Ex014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String palavra = sc.nextLine();
        String[] palavras = palavra.split(" ");
        for(String palavra01 : palavras) {
            System.out.println(palavra01);
        }
    }
}

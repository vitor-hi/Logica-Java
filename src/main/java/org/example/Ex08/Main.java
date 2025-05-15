package org.example.Ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        String invertida = "";

        for(int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);

        }
        System.out.println("Palavra invertida: " + invertida);
    }
}

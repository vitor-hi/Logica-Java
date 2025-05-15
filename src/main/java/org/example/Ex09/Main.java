package org.example.Ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String invertida = "";
        for(int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        if(palavra.contentEquals(invertida)) {
            System.out.println("A palavra é um palindromo.");
        }else {
            System.out.println("A palavra não é um palindromo.");
        }
    }
}

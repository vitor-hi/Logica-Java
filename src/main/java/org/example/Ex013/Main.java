package org.example.Ex013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        for(int i = 0; i < 5; i++) {
            System.out.println(palavra.charAt(i));
        }

    }
}

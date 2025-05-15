package org.example.Ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        int sqrt = 0;

        for (int i = 0; i * i <= number; i++) {
            sqrt = i;
        }

        System.out.println("Raiz quadrada (parte inteira)" + sqrt);
    }
}
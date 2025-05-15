package org.example.Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main fatorial = new Main();
        fatorial.CalcularFatorial();
    }

    public void CalcularFatorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);
    }
}


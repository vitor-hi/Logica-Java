package org.example.Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main numeroPrimo = new Main();
        numeroPrimo.NumeroPrimo();

    }
    public void NumeroPrimo() {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int divisivel = 0;
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                divisivel++;
            }
        }
        if(divisivel == 2) {
            System.out.println("O número é primo. ");
        }else {
            System.out.println("O numero não é primo. ");
        }
    }
}

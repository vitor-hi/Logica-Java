package org.example.Ex18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para saber o MDC e o MMC");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main mdc = new Main();
        System.out.println("MDC: " + mdc.MDC(a, b));
        System.out.println("MMC: " + mdc.MMC(a, b));


    }
    public int MDC(int a, int b) {
        while(b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    public int MMC(int a, int b) {
        return a * b / MDC(a, b);
    }
}

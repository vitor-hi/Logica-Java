package org.example.Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha um número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main tabuada = new Main();
        tabuada.tabuada(num);
    }

    public void tabuada(int num) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}

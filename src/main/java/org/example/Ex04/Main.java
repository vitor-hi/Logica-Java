package org.example.Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite 5 números: ");
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        Main maxMin = new Main();
        maxMin.maiorMenorNumero(numeros);
        System.out.println("Menor: " + maxMin.maiorMenorNumero(numeros)[0] + " Maior: " + maxMin.maiorMenorNumero(numeros)[1]);
    }

    public int[] maiorMenorNumero(int[] numeros) {
        int[] maxMin = new int[2];
        int max = numeros[0];
        int min = numeros[0];
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] > max) {
                max = numeros[i];
            }
            if(numeros[i] < min) {
                min = numeros[i];
            }
        }
        maxMin[0] = min;
        maxMin[1] = max;
        return maxMin;
    }
}

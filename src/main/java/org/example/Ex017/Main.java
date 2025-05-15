package org.example.Ex017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 1;
        while(op != 0) {
            System.out.println("1 - Somar \n2 - Subtrair \n3 - Multiplicar \n4 - Dividir \n5 - potência\n6 - raiz quadrada\n7 - porcentagem\n0 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite dois números para somar: ");
                    int numSoma1 = sc.nextInt();
                    System.out.println("+");
                    int numSoma2 = sc.nextInt();
                    System.out.println(numSoma1 + numSoma2);
                    break;
                case 2:
                    System.out.println("Digite dois números para subtrair: ");
                    int numSubtracao1 = sc.nextInt();
                    System.out.println("-");
                    int numSubtracao2 = sc.nextInt();
                    System.out.println(numSubtracao1 - numSubtracao2);
                    break;
                case 3:
                    System.out.println("Digite dois números para multiplicar: ");
                    int numMultiplicar1 = sc.nextInt();
                    System.out.println("x");
                    int numMultiplicar2 = sc.nextInt();
                    System.out.println(numMultiplicar1 * numMultiplicar2);
                    break;
                case 4:
                    System.out.println("Digite dois números para dividir: ");
                    int numDivisao1 = sc.nextInt();
                    System.out.println("/");
                    int numDivisao2 = sc.nextInt();
                    System.out.println(numDivisao1 / numDivisao2);
                    break;
                case 5:
                    System.out.println("Digite a base e o expoente para a potenciação: ");
                    int numBase = sc.nextInt();
                    System.out.println("^");
                    int numExpoente = sc.nextInt();
                    int resultado = 1;
                    if(numExpoente == 0) {
                        System.out.println("Resultado = 1");
                    }else {
                        for(int i = 0; i < numExpoente; i++) {
                            resultado *= numBase;
                        }
                    }
                    System.out.println(resultado);

                    break;
                case 6:
                    System.out.println("Digite um número para saber a raiz quadrada: ");
                    int num = sc.nextInt();
                    int sqrt = 0;
                    for(int i = 0; i * i <= num; i++){
                        sqrt = i;
                    }
                    System.out.println(sqrt);
                    break;
                case 7:
                    System.out.println("Digite dois números para saber a porcentagem: ");
                    int num1 = sc.nextInt();
                    System.out.println("%");
                    int num2 = sc.nextInt();
                    int resultado2 = num2 * num1 / 100;

                    System.out.println("Resultado: " + resultado2);
                    break;
            }

        }

    }
}

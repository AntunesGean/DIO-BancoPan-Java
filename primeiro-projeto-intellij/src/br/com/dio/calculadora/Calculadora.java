package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtracao = subtrai(a, b);
        int multiplicacao = multiplica(a, b);
        int divisao = divide(a, b);

        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrai(int a, int b) {
        return a - b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

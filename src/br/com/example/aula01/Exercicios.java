package br.com.example.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

    public static void exercicio01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int x = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int y = sc.nextInt();
        System.out.println("SOMA = " + (int) (x + y));
        sc.close();
    }

    public static void exercicio02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A = %.4f%n", area);
        sc.close();
    }

    public static void exercicio03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int valor3 = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int valor4 = sc.nextInt();
        System.out.println("DIFERENCA = " + (valor1 * valor2 - valor3 * valor4));
        sc.close();
    }

    public static void exercicio04() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Escreva o numero do funcionario: ");
        int numFunc = sc.nextInt();
        System.out.printf("Digite o numero de horas trabalhada do funcionario %d: ", numFunc);
        double horasTrabalhadas = sc.nextInt();
        System.out.printf("Digite o valor/hora recebido pelo funcionario %d: ", numFunc);
        double valorHoraSalario = sc.nextDouble();
        System.out.printf("Funcionario: %d %n", numFunc);
        System.out.printf("SALARIO: U$ %.2f", (valorHoraSalario * horasTrabalhadas));
        sc.close();
    }
}

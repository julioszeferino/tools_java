package br.com.example.aula01;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosA {

    public void testeEntradaDados() {

        // Instanciando um objeto da classe Scanner
        Scanner sc = new Scanner(System.in);

        // Lendo um texto
        System.out.println("Digite um texto: ");
        String x;
        x = sc.next(); // lê até o primeiro espaço em branco
        System.out.println("Você digitou: " + x);

        // Lendo um inteiro
        System.out.println("Digite um inteiro: ");
        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        // Lendo um double
        System.out.println("Digite um double: ");
        Locale.setDefault(Locale.US);
        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        // Lendo um char
        System.out.println("Digite um char: ");
        char c;
        c = sc.next().charAt(0); // lê o primeiro caractere
        System.out.println("Você digitou: " + c);

        // fechando
        sc.close();
    }

}

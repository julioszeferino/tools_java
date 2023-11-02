package br.com.example.aula01;

import java.util.Locale;

public class SaidaDadosJava {

    public void testeSaidaDados() {
        // Sem quebra de linha
        System.out.print("Olá, mundo!");

        // Com quebra de linha
        System.out.println("Olá, mundo!");

        // formatando a saída
        System.out.printf("Olá, %s! Você tem %d anos.", "João", 25);

        // formatando casas decimais
        // %f - ponto flutuante
        // %s - string
        // %d - inteiro
        // %n - quebra de linha
        System.out.printf("\nO valor de PI é %.2f\n", Math.PI);

        // definindo separador de decimal
        Locale.setDefault(Locale.US);
        System.out.printf("\nO valor de PI é %.2f\n", Math.PI);

        // Concatenando Strings
        String nome = "João";
        int idade = 25;
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }

}

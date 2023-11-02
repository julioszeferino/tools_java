package br.com.example.aula02;

// Operadores lógicos
// && - AND
// || - OR
// ! - NOT

public class OperadoresComparacao {

    public static void testeOperadoresComparacao(){

        // if-elif-else
        int x = 5;
        int y = 10;

        if (x < y) {
            System.out.println("x é menor que y");
        } else if (x > y) {
            System.out.println("x é maior que y");
        } else {
            System.out.println("x é igual a y");
        }

        // switch-case
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        // Operador ternário
        int a = 10;
        int b = 20;
        // (condição) ? valor_se_verdadeiro : valor_se_falso
        int c = (a < b) ? a : b;
        System.out.println(c);

    }


}

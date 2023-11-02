package br.com.example.aula01;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

public class FuncoesMatematicas {

    public void testeFuncoesMatematicas() {

        // Raiz quadrada
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);

        // Potência
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);

        // Valor absoluto
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);

        // Arredondamento
        double n1 = 3.14;
        double d1 = Math.floor(n1); // Arredondando para baixo
        double u1 = Math.ceil(n1); // Arredondando para cima
        double p1 = Math.round(n1); // Arredondando para o mais próximo

        // Gerando números aleatórios
        double aleatorio = Math.random(); // Gera um número aleatório entre 0 e 1
        double aleatorio2 = (int) Math.random() * 100; // Gera um número aleatório inteiro entre 0 e 100

    }

}

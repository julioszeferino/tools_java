package br.com.example.aula02;

public class EstruturasRepeticao {


    public static void testeEstruturasRepeticao(){

            // for
            for (int i = 0; i < 5; i++) {
                System.out.println("Valor de i: " + i);
            }

            // while
            int i = 0;
            while (i < 5) {
                System.out.println("Valor de i: " + i);
                i++;
            }

            // do-while
            i = 0;
            do {
                System.out.println("Valor de i: " + i);
                i++;
            } while (i < 5);
    }

}

package br.com.example.aula01;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosB {

    public void testeEntradaDados() {

        // Instanciando um objeto da classe Scanner
        Scanner sc = new Scanner(System.in);

        // Lendo ate o final da linha
        String s1, s2, s3;
        s1 = sc.nextLine(); // lê a linha inteira (ate enter)
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // fechando
        sc.close();
    }

}

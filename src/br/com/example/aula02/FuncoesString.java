package br.com.example.aula02;

public class FuncoesString {


    public static void testeFuncoesString() {

        String nome = "João";

        System.out.println(("Tamanho da string: " + nome.length()));

        // Busca
        System.out.println(("Caracter na posição 2: " + nome.charAt(2)));
        System.out.println(("Índice do caracter 'o': " + nome.indexOf('o')));
        System.out.println("Ultimo Indice do caracter 'o': " + nome.lastIndexOf('o'));
        System.out.println(("Índice do caracter 'o' a partir da posição 2: " + nome.indexOf('o', 2)));
        System.out.println("Contém 'o': " + nome.contains("o"));
        System.out.println("Comparar 'João' com 'João': " + nome.equals("João"));
        System.out.println("Comparar 'João' com 'João': " + nome.equalsIgnoreCase("João"));

        // Formatacao
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Minúsculas: " + nome.toLowerCase());
        System.out.println("Substituir 'o' por 'a': " + nome.replace('o', 'a'));
        System.out.println("Substring de 1 a 3: " + nome.substring(1, 3));
        System.out.println("Corrigir espaços em branco: " + nome.trim());
        System.out.println("Concatenar: " + nome.concat(" da Silva"));
        System.out.println("Começa com 'J': " + nome.startsWith("J"));
        System.out.println("Termina com 'o': " + nome.endsWith("o"));
        System.out.println("Split: " + nome.split("o"));

    }
}

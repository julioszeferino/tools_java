package br.com.example.aula08;
/*
 * BOXING
 * - É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.
 * - Exemplo: int x = 20; Object obj = x;
 * - Neste exemplo o compilador faz o boxing automaticamente, ou seja, ele cria uma variável obj na memoria
 * stack e aponta para o objeto x na memoria heap.
 *
 * UNBOXING
 * - É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível.
 * - Exemplo: int y = (int) obj;
 * - Neste exemplo o compilador faz o unboxing automaticamente, ou seja, ele cria uma variável y na memoria
 * stack com o valor do objeto obj na memoria heap, sem ponteiro.
 *
 * WRAPPER CLASSES
 * - São classes que contém tipos primitivos como atributos.
 * - A vantagem e que essas classes aceitam valores null e usufruem de todo o poder da POO.
 * - Exemplos:
 *      - Integer
 *      - Double
 *      - Boolean
 *      - Character
 * - geralmente usamos wrapper em campos de entidades, pois o banco de dados aceita valores nulos.
 */

public class BoxUnboxWrapper {

    public static void main() {

        int x = 20;
        Object obj = x; // boxing
        System.out.println(obj); // printa 20


        int y = (int) obj; // unboxing
        System.out.println(y); // printa

        // wrapper
        // quando usamos o wrapper, o unboxing e boxing sao feitos automaticamente
        Integer objw = 20;
        int w = objw; // unboxing sem a necessidade de casting (int w = (int) objw)
        System.out.println(w); // printa 20

    }




}

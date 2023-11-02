package br.com.example.aula02;

public class OperadoresBitWise {
    /*
     * & - AND bit a bit
     * | - OR bit a bit
     * ^ - XOR bit a bit (uma delas verdadeira, mas não ambas)
     * ~ - NOT bit a bit
     */

     public static void testeOperadoresBitWise() {

            int a = 10; // 1010
            int b = 20; // 10100

            // & - AND bit a bit
            int c = a & b; // 10100
            System.out.println(c);

            // | - OR bit a bit
            c = a | b; // 10110
            System.out.println(c);

            // ^ - XOR bit a bit (uma delas verdadeira, mas não ambas)
            c = a ^ b; // 00010
            System.out.println(c);

            // ~ - NOT bit a bit
            c = ~a; // 0101
            System.out.println(c);
     }
}

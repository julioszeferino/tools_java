package br.com.example.aula01;

/*
 * <tipo> <nomeVariavel> = <valor inicial - opcional>;
 * 1 bit -> Pode armazenar 2 possibilidades: 0 ou 1
 * Tipo byte tem 8 bits -> 2^8 = 256 possibilidades
 * Com sinal: -128 até 127 = 256 possibilidades
 */

 /*
 * CONVENCOES
 * - Nomes de variáveis começam com letra minúscula
 * - Nomes de classes começam com letra maiúscula
 * - Nomes de variáveis compostas são separadas por letra maiúscula
 * - CamelCase para nomes compostos de variáveis
 * - PascalCase para nomes de classes
 */

public class Variaveis {

    public int idade = 25;
    public double altura = 1.75;
    public float peso = 80.5f;
    public char sexo = 'M';
    public boolean ehBrasileiro = true;
    public String nome = "João";

    // casting
    public int idade2 = (int) 25.5;

    // constantes
    public final int IDADE = 25;

}

package br.com.example.aula08;

/*
 * MATRIZES
 * - Vetor de vetores.
 * - E uma estrutura de dados homogênea (dados do mesmo tipo).
 * - E uma estrutura de dados estática (tamanho fixo).
 * - E uma estrutura de dados ordenada (elementos acessados por meio de posições: 0,1,2...).
 * - Em Java, uma matriz e uma estrutura de dados composta por linhas e colunas.
 *
 * VANTAGENS MATRIZ
 * - Acesso imediato aos elementos (se eu quiser acessar o elemento 5, eu sei exatamente onde ele esta).
 *
 * DESVANTAGENS MATRIZ
 * - Tamanho fixo
 * - Dificuldade para se realizar inserções e deleções. (se eu quiser inserir um elemento no meio da matriz,
 * eu tenho que deslocar todos os elementos posteriores a ele).
 */

public class Matrizes {

    public static void main(String[] args){

        // criando uma matriz de inteiros
        int[][] matriz = new int[2][3];

        // inserindo valores na matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        // acessando valores da matriz
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);

        // criando uma matriz de strings
        String[][] matrizString = new String[2][3];

        // inserindo valores na matriz
        matrizString[0][0] = "a";
        matrizString[0][1] = "b";
        matrizString[0][2] = "c";
        matrizString[1][0] = "d";
        matrizString[1][1] = "e";
        matrizString[1][2] = "f";
        matrizString[2][1] = "g";
        matrizString[2][2] = "h";
        matrizString[2][3] = "i";

        // tamanho da matriz
        System.out.println(matrizString.length); // 2
        System.out.println(matrizString[0].length); // 3

        

    }

}

package br.com.example.aula08;

import br.com.example.aula04.Product;

/*
 * VETORES
 * - É uma estrutura de dados homogênea (dados do mesmo tipo).
 * - É uma estrutura de dados estática (tamanho fixo).
 * - Quando instanciamo um vetor, ele cria um bloco de memória contíguo (um ao lado do outro na memória) de
 * acordo com o tamanho que definimos. Por exemplo, se definirmos um vetor de 10 posições, ele vai criar
 * um bloco de memória de 10 posições.
 * - É uma estrutura de dados ordenada (elementos acessados por meio de posições: 0,1,2...).
 *
 * VANTAGENS
 * - Acesso imediato aos elementos pela sua posição (nao precisa percorrer o vetor pra recuperar o dado, e
 * so informar a posicao).
 * DESVANTAGENS
 * - Tamanho fixo (se tenho 100 posicoes, aloco 100 posicoes na memoria, mesmo que eu nao use todas elas)
 * - Dificuldade para se realizar inserções e deleções (tem que ficar deslocando os elementos). Se eu
 * deletar o elemento 5, tenho que deslocar todos os elementos a partir do 6 para a esquerda (o que e
 * custoso).
 */

public class Vetores {

    public void testeVetores(){
        int v1 = 3;
        double[] vect = new double[v1]; // Instanciando um vetor de 3 posicoes do tipo double (0,1,2)

        // atribuindo valores ao vetor
        for (int i = 0; i<v1; i++) {
            // Gerando um numero aleatorio entre 0 e 10 e atribuindo a cada posicao do vetor
            vect[i] = Math.random() * 10;
        }

        // Exmplo 02
        // Vetor com elementos classes
        Product[] vect2 = new Product[v1];

        // Instanciando os objetos
        for (int i = 0; i<v1; i++) {
            vect2[i] = new Product();
            // Neste caso, o vetor vai ter 3 posicoes, e cada posicao vai ter um objeto do tipo Product
            // o vetor e armazenado na memoria heap, e cada posicao do vetor e um ponteiro para um objeto
            // do tipo Product tambem armazenado na memoria heap.
        }

    }
}

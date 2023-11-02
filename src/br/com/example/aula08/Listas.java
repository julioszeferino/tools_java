package br.com.example.aula08;
/*
 * LISTAS
 * - É uma estrutura de dados homogênea (dados do mesmo tipo).
 * - É uma estrutura de dados dinâmica (tamanho variável).
 * - Quando instanciamos uma lista, ela inicia vazia e vai alocando os elementos sob demanda.
 * - É uma estrutura de dados ordenada (elementos acessados por meio de posições: 0,1,2...).
 * - Cada elemento ocupa um "nó" (ou nodo) da lista.
 *    - Cada nó possui um dado e uma referência para o próximo nó da sequência.
 *    - Se a lista for duplamente encadeada, cada nó possui também uma referência para o nó anterior.
 *
 * - Em Java temos o tipo List que e uma interface.
 * - Lists sao implementadas pelas classes:
 *
 *  - ArrayList: implementacao de lista mais utilizada. Possui acesso mais lento aos elementos, mas possui um
 * consumo menor de memória. É mais utilizada quando se precisa fazer muitas buscas, e poucas
 * inserções e deleções. O acesso aos elementos é feito por meio de índices (posições). Cada elemento
 * possui um índice, que começa em 0.
 *
 *  - LinkedList: implementacao de lista menos utilizada. Possui acesso mais rápido aos elementos,
 * mas possui um consumo maior de memória. É mais utilizada quando se precisa de uma lista que seja
 * modificada com frequência. O acesso aos elementos é feito por meio de ponteiros. Cada elemento
 * possui um ponteiro para o elemento seguinte, e para o elemento anterior (lista duplamente encadeada).
 *
 *  - Stack: tem operações específicas de pilha (pop, push, peek). Em uma pilha,
 * a remoção e a inserção de elementos seguem a regra LIFO (Last In First Out). O último elemento a
 * ser inserido é o primeiro a ser removido.
 *
 *  - Queue: tem operações específicas de fila (offer, poll, peek). Em uma fila, a remoção e a inserção
 * de elementos seguem a regra FIFO (First In First Out). O primeiro elemento a ser inserido é o primeiro
 * a ser removido.
 *
 *  - Set: conjunto não aceita repetição de elementos.
 *
 *
 * VANTAGENS LISTA
 * - Tamanho variável
 * - Facilidade para se realizar inserções e deleções
 *
 * DESVANTAGENS LISTA
 * - Acesso sequencial aos elementos (se eu quiser acessar o elemento 5, tenho que percorrer todos os
 * elementos anteriores a ele) - Dependendo da implementação, pode ser mais rapido ou mais lento.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {

        List<String> list; // <String> e um generics
        // O generics e um tipo que pode ser parametrizado. No caso, o tipo da lista e String.

        list = new ArrayList<>();
        // perceba que a variavel list e do tipo List, mas a instancia e do tipo ArrayList
        // List nao pode ser instanciada, pois e uma interface. Entao instanciamos uma classe que implementa
        // a interface List. No caso, ArrayList.

        list.size(); // retorna o tamanho da lista
        list.add("Joao"); // adiciona um elemento na lista
        list.add("Maria"); // adiciona um elemento na lista
        list.add("Jose"); // adiciona um elemento na lista

        list.remove(0); // remove o elemento da posicao 0

        list.removeIf(x -> x == "Jose"); // remove o elemento que for igual a Jose

        list.indexOf("Joao"); // retorna a posicao do elemento Joao

        list.contains("Joao"); // retorna true se a lista contem o elemento Joao

        list.add(2, "Carlos"); // adiciona o elemento Carlos na posicao 2

        // Filtrando elementos que comecam com J
        // No Java 8+, podemos converter uma lista para stream para
        // aplicar operaçoes de alta ordem, como filter, map, reduce, etc.
        // Contudo, para consumir a stream e gerar uma lista novamente, precisamos
        // usar o metodo collect(Collectors.toList())
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J')
                                        .collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        // Encontrando o primeiro elemento que começa com J
        String name = list.stream().filter(x -> x.charAt(0) == 'J')
                                    .findFirst()
                                    .orElse(null);

        System.out.println(name);

    }

}

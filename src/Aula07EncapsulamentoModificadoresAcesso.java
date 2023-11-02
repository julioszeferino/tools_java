/*
 * ENCAPSULAMENTO
 * É um princípio que consiste em esconder detalhes de implementação de um componente,
 * expondo apenas operações seguras e que mantenham o objeto em um estado consistente.
 * - So vamos expor o que for necessário.
 * - REGRAS:
 * 1 - Declarar os atributos como private.
 * 2 - Criar métodos get e set para cada atributo.
 * 3 - No método set, fazer a validação.
 *
 *
 * MODIFICADORES DE ACESSO
 * - São palavras chave que definem a visibilidade de um atributo ou método.
 * - public: Acesso de qualquer lugar.
 * - protected: Acesso da mesma classe ou subclasses (heranca) ou classes do mesmo pacote.
 * - default: Acesso da mesma classe ou classes do mesmo pacote.
 * - private: Acesso apenas dentro da mesma classe.
 * - https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 */

import br.com.example.aula07.Product;

public class Aula07EncapsulamentoModificadoresAcesso {

    public static void main(){

        Product product = new Product("TV", 900.00, 10);

        product.setName("TV 4K");
        product.setPrice(1000.00);
        product.setQuantity(10);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());

    }

}

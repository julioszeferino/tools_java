/*
 * CONSTRUTORES
 * - Executado quando o objeto é criado.
 * - Usamos quando queremos que algo seja executado quando o objeto é criado.
 * - Ou quando queremos que o objeto receba dados/dependências para ser criado.
 * - E possivel ter mais de um construtor na classe. (Sobrecarga)
 * - Quando usamos o construtor padrao da classe, suas variaveis são inicializadas com valores padrao.
 * Ex. Product product = new Product();
 * name=null, price=0.0, quantity=0
 *
 * Contudo, nao faz sentido um produto ser criado sem nome, preço e uma qtde inicial.
 * Por isso, criamos um construtor que recebe os dados para inicializar o objeto.
 *
 * PALAVRA THIS
 * - É uma referencia para o proprio objeto.
 * - Quando usamos o this estamos referencia a variavel que esta armazenada na memoria heap.
 * - Usamos para diferenciar a variavel de instancia da variavel local.
 *
 * SOBRECARGA
 * - Da forma com que criamos o construtor, estamos obrigando o usuario a informar
 * os parametros do construtor.
 * - Para resolver isso, podemos criar um construtor padrao e um construtor com parametros.
 * - Isso é chamado de sobrecarga.
 * - Sobrecarga é a criação de mais de um construtor na classe.
 */

import java.util.Locale;
import java.util.Scanner;

import br.com.example.aula06.Product;

public class Aula06ConstrutoresSobrecarga {

    public static void main(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println(product.toString());

        sc.close();
    }

}

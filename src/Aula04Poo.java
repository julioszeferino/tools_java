import java.util.Locale;
import java.util.Scanner;

import br.com.example.aula04.Product;

public class Aula04Poo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        // System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        sc.close();

        // Testando metodos de classe object
        // product.equals(product);
        // product.hashCode();
        System.out.println(product.toString());

        
    }

}

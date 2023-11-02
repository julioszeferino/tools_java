import java.util.Locale;
import java.util.Scanner;

import br.com.example.aula03.entities.Triangle;

/*
 * Quando declaramos uma variavel ela e armazenada em uma area Stack
 * Ex: int x = 20;
 * Contudo, quando instanciamos um objeto, ele e armazenado em uma area Heap
 * Ex: Triangle x = new Triangle();
 * A variavel x nao sera declarada na area Stack, mas sim um ponteiro para a area Heap
 * Um ponteiro e uma referencia para o endereco de memoria onde o objeto foi armazenado
 */

public class Aula03Poo {

    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        x.a= sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // double p = (xA + xB + xC) / 2.0;
        // double p = (x.a + x.b + x.c) / 2.0;
        // double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        // double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        double areaX = x.area();

        // p = (yA + yB + yC) / 2.0;
        // p = (y.a + y.b + y.c) / 2.0;
        // double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        // double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }

}

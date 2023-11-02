import java.util.Locale;
import java.util.Scanner;

import br.com.example.aula05.Calculator;

/*
 * Variaveis e metodos estaticos
 *
 * Se o metodo for estatico, todos os metodos que ele chama precisam ser estaticos.
 *
 * Se estivermos chamando metodos nao estaticos, precisamos instanciar um objeto e chamar o metodo
 * a partir desse objeto.
 * Ex. Carro carro = new Carro();
 * carro.ligar();
 *
 * Usamos variaveis estaticas quando o valor for comum a todos os objetos e nao precisar ser alterado.
 * Usamos metodos estaticos quando, independente do objeto, o metodo retornar o mesmo valor.
 * Ex.
 * Calculadora calc1 = new Calculadora();
 * Calculadora calc2 = new Calculadora();
 *
 * calc1.soma(2, 3); # retorna 5
 * calc2.soma(2, 3); # retorna 5
 *
 * Logo, o metodo soma nao depende do objeto, entao podemos torna-lo estatico.
 *
 * Outro ponto importante e que podemos chamar metodos estaticos diretamente da classe, sem precisar
 * instanciar um objeto.
 * Ex. Calculadora.soma(2, 3);
 */

public class Aula05MetodosEstaticos {

    public static final double PI = 3.14159; // final = constante

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);

        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}

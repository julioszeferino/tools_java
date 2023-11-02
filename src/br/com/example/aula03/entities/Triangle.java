package br.com.example.aula03.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = p();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double p() {
        return (a + b + c) / 2.0;
    }
}

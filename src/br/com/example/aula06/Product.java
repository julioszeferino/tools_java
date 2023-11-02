package br.com.example.aula06;

public class Product {

    public String name;
    public double price;
    public int quantity;


    // Construtor padrao
    public Product() {
    }

    // Construtor com parametros (sobrecarga)
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Construtor com parametros (sobrecarga)
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantityNew) {
        this.quantity += quantityNew;
    }

    public void removeProducts(int quantityNew) {
        this.quantity -= quantityNew;
    }

    // Sobrescrevendo o metodo toString da classe Object
    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }
}

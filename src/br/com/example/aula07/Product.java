package br.com.example.aula07;

public class Product {

    private String name;
    private double price;
    private int quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

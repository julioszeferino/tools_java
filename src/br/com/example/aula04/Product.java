package br.com.example.aula04;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantityNew) {
        // usamos o this para referenciar o atributo da classe
        this.quantity += quantityNew;
    }

    public void removeProducts(int quantityNew) {
        this.quantity -= quantityNew;
    }

    // Sobrescrevendo o metodo toString da classe Object
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}

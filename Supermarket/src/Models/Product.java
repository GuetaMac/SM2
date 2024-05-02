// Package declaration indicating that the Product class is part of the "Models" package
package Models;

// Definition of the Product class
public class Product {
    // Private instance variables to store product ID, name, price, and quantity
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor to create a Product object with specified parameters
    public Product(int id, String name, double price, int quantity) {
        // Assign the provided product ID to the instance variable
        this.id = id;

        // Assign the provided product name to the instance variable
        this.name = name;

        // Assign the provided product price to the instance variable
        this.price = price;

        // Assign the provided product quantity to the instance variable
        this.quantity = quantity;
    }

    // Constructor to create a Product object with default product ID (-1)
    public Product(String name, double price, int quantity) {
        this.id = -1;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to update the product price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    // Method to update the product name
    public void updateName(String name) {
        this.name = name;
    }

    // Method to update the product quantity
    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter method to retrieve the product ID
    public int getProdID() {
        return this.id;
    }

    // Getter method to retrieve the product name
    public String getName() {
        return this.name;
    }

    // Getter method to retrieve the product price
    public double getPrice() {
        return this.price;
    }

    // Getter method to retrieve the product quantity
    public int getQuantity() {
        return this.quantity;
    }

    // Method to calculate and retrieve the subtotal for the product
    public double getSubtotal() {
        return this.quantity * this.price;
    }

    // Method to generate a summary of the product's information
    public String getSummary() {
        return this.name + " : Php" + String.format("%.2f", this.price) + " @ " + this.quantity + "pc(s).";
    }

    // Method to print a summary of the product to the console
    public void printSummary() {
        System.out.println(getSummary());
    }
}

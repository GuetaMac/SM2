// Package declaration indicating that the TransactionItem class is part of the "Models" package
package Models;

// Definition of the TransactionItem class
public class TransactionItem {
    // Private instance variables to store transaction ID and associated Product
    private int transactID;
    private Product p;

    // Constructor to create a TransactionItem object with specified parameters
    public TransactionItem(int transactID, Product p, int quantity, double subtotal) {
        // Assign the provided transaction ID to the instance variable
        this.transactID = transactID;

        // Assign the provided Product to the instance variable
        this.p = p;

        // Update the price of the associated Product based on the provided subtotal and quantity
        this.p.updatePrice(subtotal / quantity);

        // Update the quantity of the associated Product based on the provided quantity
        this.p.updateQuantity(quantity);
    }

    // Getter method to retrieve the associated Product
    public Product getProduct() {
        return this.p;
    }

    // Getter method to retrieve the transaction ID
    public int getTransactID() {
        return this.transactID;
    }
}

// Package declaration indicating that the Transaction class is part of the "Models" package
package Models;

// Importing necessary classes for Timestamp and ArrayList
import java.sql.Timestamp;
import java.util.ArrayList;

// Definition of the Transaction class
public class Transaction {
    // Private instance variables to store order date and time, buyer, items, transaction ID, and donation
    private Timestamp orderDateTime;
    private User buyer;
    private ArrayList<Product> items;
    private int transactID;
    private double donation;

    // Constructor to create a Transaction object with specified parameters
    public Transaction(int transactID, User buyer, ArrayList<Product> items, Timestamp orderDateTime, double donation) {
        // Assign the provided transaction ID to the instance variable
        this.transactID = transactID;

        // Assign the provided buyer to the instance variable
        this.buyer = buyer;

        // Assign the provided items to the instance variable
        this.items = items;

        // Assign the provided order date and time to the instance variable
        this.orderDateTime = orderDateTime;

        // Assign the provided donation amount to the instance variable
        this.donation = donation;
    }

    // Constructor to create a Transaction object with default transaction ID (-1)
    public Transaction(User buyer, ArrayList<Product> items, double donation) {
        this.transactID = -1;
        this.buyer = buyer;
        this.items = items;
        this.orderDateTime = null;
        this.donation = donation;
    }

    // Getter method to retrieve the donation amount
    public double getDonation() {
        return this.donation;
    }

    // Getter method to retrieve the transaction ID
    public int getTransactID() {
        return this.transactID;
    }

    // Getter method to retrieve the order date and time
    public Timestamp getOrderDateTime() {
        return this.orderDateTime;
    }

    // Getter method to retrieve the buyer
    public User getBuyer() {
        return this.buyer;
    }

    // Method to calculate and retrieve the subtotal of all items in the transaction
    public double getSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < this.items.size(); i++)
            subtotal += this.items.get(i).getSubtotal();
        return subtotal;
    }

    // Getter method to retrieve the list of items in the transaction
    public ArrayList<Product> getItems() {
        return this.items;
    }

    // Method to calculate and retrieve the total quantity of items in the transaction
    public int getQuantity() {
        int quantity = 0;
        for (int i = 0; i < this.items.size(); i++)
            quantity += this.items.get(i).getQuantity();
        return quantity;
    }

    // Method to generate a summary of the transaction's information
    public String getSummary() {
        // Default "N/A" if order date and time is null, otherwise use the provided value
        String orderDateTime = "N/A";
        if (this.orderDateTime != null)
            orderDateTime = this.orderDateTime.toString();
        
        // Return a formatted summary string
        return "Order Date & Time: " + orderDateTime + "\nTransaction ID: " + this.transactID +
               "\nQuantity: " + this.getQuantity() + "\nSubtotal: Php" + this.getSubtotal() +
               "\nDonation: Php" + this.getDonation() + "\n\nItems:\n";
    }

    // Method to generate a verbose summary of the transaction's information
    public String getVerboseSummary() {
        // Delimiter for visual separation
        String bar = "========================================\n";

        // Combine buyer's summary, basic summary, and item details for a comprehensive output
        String output = this.buyer.getSummary() + "\n" + getSummary();
        for (int i = 0; i < this.items.size(); i++)
            output += "    - " + this.items.get(i).getSummary() + "\n";
        
        // Enclose the entire summary in visual bars
        return bar + output + bar;
    }

    // Method to print a verbose summary of the transaction to the console
    public void printVerboseSummary() {
        System.out.println(getVerboseSummary());
    }

    // Method to print a summary of the transaction to the console
    public void printSummary() {
        System.out.println(getSummary());
    }
}

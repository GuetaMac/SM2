// Package declaration indicating that the User class is part of the "Models" package
package Models;

// Definition of the User class
public class User {
    // Private instance variables to store user information
    private int userID;
    private String username;
    private String password;
    private String name;
    private String address;
    private int type;

    // Constructor to create a User object with specified parameters
    public User(int userID, String username, String password, int type, String name, String address) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.type = type;
    }
    
    // Constructor to create a User object with default userID (-1)
    public User(String username, String password, int type, String name, String address) {
        this.userID = -1;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    // Getter method to retrieve the user's ID
    public int getUserID() {
        return this.userID;
    }

    // Getter method to retrieve the user's username
    public String getUsername() {
        return this.username;
    }

    // Getter method to retrieve the user's password
    public String getPassword() {
        return this.password;
    }

    // Getter method to retrieve the user's name
    public String getName() {
        return this.name;
    }

    // Getter method to retrieve the user's address
    public String getAddress() {
        return this.address;
    }

    // Getter method to retrieve the user's type
    public int getType() {
        return this.type;
    }

    // Method to update the user's ID
    public void updateUserID(int userID) {
        this.userID = userID;
    }

    // Method to update the user's username
    public void updateUsername(String newUsername) {
        this.username = newUsername;
    }

    // Method to update the user's password
    public void updatePassword(String newPassword) {
        this.password = newPassword;
    }

    // Method to update the user's name
    public void updateName(String newName) {
        this.name = newName;
    }

    // Method to update the user's address
    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    // Method to update the user's type
    public void updateType(int type) {
        this.type = type;
    }

    // Method to generate a summary of the user's information
    public String getSummary() {
        return "Username: " + this.username + "\nName: " + this.name + "\nAddress: " + this.address + "\n";
    }

    // Method to print a summary of the user's information to the console
    public void printSummary() {
        System.out.println(getSummary());
    }
}

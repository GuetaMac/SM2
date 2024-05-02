import java.util.ArrayList;

import Drivers.*;
import Models.*;

// Define a public class named Supermarket
public class Supermarket {
    // The main method, the entry point for the Java application
    public static void main(String[] args) {
        // Building default SQL server data
        if(true){
            // Create an instance of the SQL class
            SQL sql = new SQL();

            // Build the default database and tables
            sql.buildDB();
            sql.buildUsersTable();
            sql.buildProductsTable();
            sql.buildTransactionsTable();
            sql.buildTransactionItemTable();

            // Add an admin user and a regular user to the users table
            sql.addUser(new User("admin", "admin", 0, "Test Admin", "Philippines"));
            sql.addUser(new User("user", "user", 1, "Test Client", "Philippines"));

            // Retrieve the list of users and print a summary for each user
            ArrayList<User> users = sql.getUsers();
            for(int i = 0; i < users.size(); i++){
                users.get(i).printSummary();
            }
            System.out.println("");

            // Add several products to the products table
            sql.addProduct(new Product("Piattos", 20.00, 100));
            sql.addProduct(new Product("Nova", 20.00, 100));
            sql.addProduct(new Product("Clover", 8.00, 100));
            sql.addProduct(new Product("Mismo Royal", 20.00, 100));
            sql.addProduct(new Product("Mismo Coke", 20.00, 100));
            sql.addProduct(new Product("Loaded (Vanilla)", 8.00, 100));
            sql.addProduct(new Product("Moby", 8.00, 100));

            // Retrieve the list of products and print a summary for each product
            ArrayList<Product> p = sql.getProducts();
            for(int i = 0; i < p.size(); i++){
                p.get(i).printSummary();
            }
            System.out.println("");
        }

        // Create an instance of the GUI class
        GUI g = new GUI();

        // Create an instance of the Controller class, passing the GUI instance
        Controller c = new Controller(g);

        // Set the GUI visible and switch to the login view
        g.setVisible(true);
        g.switchToLogin();
    }
}


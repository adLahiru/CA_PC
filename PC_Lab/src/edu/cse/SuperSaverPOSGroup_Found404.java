package edu.cse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SuperSaverPOSGroup_Found404 {
    public static void admin_activiity_options() {
        DB dsf = DB.getInstance();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your option : ");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                System.out.println("Good Bye !");
                System.out.println();
                user_login();
                break;
            }
        }
    }

    public static void admin_activity() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Option : ");
        System.out.println("    1. Add Branch");
        System.out.println("    2. Add Cashiers");
        System.out.println("    3. Add Item Discount");
        System.out.println("    4. Add Items");
        System.out.println("    5. Generate a total revenue report");
        System.out.println("    6. Log out");
        admin_activiity_options();

    }

    public static void user_login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username : ");
        String username = scanner.nextLine();
        System.out.print("Enter password : ");
        String password = scanner.nextLine();

        // String username = "admin";
        // String password = "admin";
        System.out.println();

        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Hi " + username + " .");
            admin_activity();
        } else {
            System.out.println("Invalid username or password");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Show Welocome message of shop
        String welcome = "Welcome to Found404 Pvt Ltd";
        int display_length = 70;
        for (int i = 0; i < display_length; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < (display_length - welcome.length() - 2) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print(welcome);
        for (int i = 0; i < (display_length - welcome.length() - 2) / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < display_length; i++) {
            System.out.print("-");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
        user_login();

    }

}

class DB {
    private static DB db;

    public static DB getInstance() {
        if (db == null) {
            db = new DB();
        }
        return db;
    }

    Items itemDb = new Items();

    public DB() {
        itemDb.loadItemsFromCSV("./itemData.csv");
    }
}

class Items {
    private List<Item> items = new ArrayList<>();

    /**
     * 
     * 
     * @param filePath a string containing file path
     */
    public void loadItemsFromCSV(String filePath) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date manufacDate = new Date();
                Date expireDate = new Date();

                try {
                    manufacDate = formatter.parse(values[4]);
                    expireDate = formatter.parse(values[5]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                Item item = new Item(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2]),
                        Double.parseDouble(values[3]), manufacDate, expireDate, values[6], Integer.parseInt(values[7]));
                items.add(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Find whether there is an item with the given item Id
     * 
     * @param itemId an integer
     * @return null if item not found. Item if it is found
     */
    public Item findItem(int itemId) {
        for (Item item : items) {
            if (item.itemCode == itemId) {
                return item;
            }
        }
        return null;
    }

    class Item {
        int itemCode;
        String name;
        double price;
        double weight;
        Date manDate;
        Date expDate;
        String manufacturer;
        int quantity;

        public Item(int itemCode, String name, double price, double weight, Date manufacDate, Date expireDate,
                String manufac, int quantity) {
            this.itemCode = itemCode;
            this.name = name;
            this.price = price;
            this.weight = weight;
            this.manDate = manufacDate;
            this.expDate = expireDate;
            this.manufacturer = manufac;
            this.quantity = quantity;
            System.out.println("hiiii");
        }
    }
}

class Cashiers {

    class Cashier {

    }
}
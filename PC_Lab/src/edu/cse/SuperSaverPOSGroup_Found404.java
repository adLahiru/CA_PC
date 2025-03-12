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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class SuperSaverPOSGroup_Found404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DB db = new DB();

    }

}

class DB {
    private List<Item> items = new ArrayList<>();

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

    class Item {
        private int itemCode;
        private String name;
        private double price;
        double weight;
        Date manDate;
        Date expDate;
        String manufacturer;
        private int quantity;

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
            System.out.println(name);
        }
    }

    public DB() {
        loadItemsFromCSV("./itemData.csv");
    }
}

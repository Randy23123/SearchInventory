package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) throws IOException {
        ArrayList<Product> inventory = getInventory();
        FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
        BufferedReader buffReader = new BufferedReader(fileReader);
        String input = "";
        String productName;
        int productID;
        double productPrice;
        while ((input = buffReader.readLine()) != null){
            String[] temp = input.split("\\|");
            productID = Integer.parseInt(temp[0]);
            productName = temp[1];
            productPrice = Double.parseDouble(temp[2]);
            inventory.add(new Product(productID, productName, productPrice));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry: ");

        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n", p.getId(), p.getName(), p.getPrice());
        }
    }

    private static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        return inventory;
    }
}
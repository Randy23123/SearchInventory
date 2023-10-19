package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        inventory.add(new Product(1, "banana", .45));
        inventory.add(new Product(2, "apple", .25));
        inventory.add(new Product(3, "grapes", 3.25));
        inventory.add(new Product(4, "jalapeno", .12));
        inventory.add(new Product(5, "beans", 2.85));
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
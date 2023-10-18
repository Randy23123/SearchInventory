package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        inventory.add(new Product(1,"banana", .45));
        inventory.add(new Product(2, "apple",.25));
        inventory.add(new Product(3, "grapes", 3.25));
        inventory.add(new Product(4, "jalapeno", .12));
        inventory.add(new Product(5, "beans", 2.85));
        Scanner scanner = new Scanner(System.in);

        
    }

    private static ArrayList<Product> getInventory() {
    }
}

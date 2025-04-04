/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcysystem;

/**
 *
 * @author omarm
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pharmacy {
    private List<Drug> inventory;
    private int capacity;
    private double totalSales;

    public Pharmacy(int capacity) {
        this.capacity = capacity;
        this.inventory = new ArrayList<>();
        this.totalSales = 0;
    }

    public void addDrug(String name, int id, double price, String category, int quantity) {
        if (inventory.size() >= capacity) {
            System.out.println("Pharmacy is at full capacity!");
            return;
        }
        inventory.add(new Drug(name, id, price, category, quantity));
        System.out.println("Drug added successfully!");
    }

    public void removeDrug(int id) {
        for (Drug drug : inventory) {
            if (drug.id == id) {
                inventory.remove(drug);
                System.out.println("Drug removed successfully!");
                return;
            }
        }
        System.out.println("Drug not found!");
    }

    public void placeOrder(Scanner scanner) {
        System.out.print("Enter drug ID to order: ");
        int id = scanner.nextInt();

        for (Drug drug : inventory) {
            if (drug.id == id) {
                System.out.println("Price per unit: $" + drug.price);

                if (drug.category.equalsIgnoreCase("prescription")) {
                    System.out.print("Do you have a prescription? (yes/no): ");
                    String prescription = scanner.next();
                    if (!prescription.equalsIgnoreCase("yes")) {
                        System.out.println("Cannot sell this drug without a prescription.");
                        return;
                    }
                }

                System.out.print("Enter quantity to buy: ");
                int quantity = scanner.nextInt();

                if (quantity > drug.quantity) {
                    System.out.println("Insufficient stock!");
                    return;
                }

                double finalPrice = drug.price * quantity;
                if (drug.category.equalsIgnoreCase("cosmetics")) {
                    finalPrice *= 1.2;
                }

                drug.quantity -= quantity;
                totalSales += finalPrice;
                System.out.println("Order placed! Total cost: $" + finalPrice);
                return;
            }
        }
        System.out.println("Drug not found!");
    }

    public void getTotalSales() {
        System.out.println("Total Sales: $" + totalSales);
    }
}

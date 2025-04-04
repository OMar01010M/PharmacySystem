/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pharmcysystem;

/**
 *
 * @author omarm
 */
import java.util.Scanner;

public class PharmacySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pharmacy capacity: ");
        int capacity = scanner.nextInt();
        Pharmacy pharmacy = new Pharmacy(capacity);

        while (true) {
            System.out.println("\nPharmacy Menu:");
            System.out.println("1. Add drug");
            System.out.println("2. Remove drug");
            System.out.println("3. Place an order");
            System.out.println("4. Get the total sales for one day");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter drug name: ");
                    String name = scanner.next();
                    System.out.print("Enter drug ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter category (cosmetics, prescription, other): ");
                    String category = scanner.next();
                    System.out.print("Enter available quantity: ");
                    int quantity = scanner.nextInt();
                    pharmacy.addDrug(name, id, price, category, quantity);
                    break;
                case 2:
                    System.out.print("Enter drug ID to remove: ");
                    int removeId = scanner.nextInt();
                    pharmacy.removeDrug(removeId);
                    break;
                case 3:
                    pharmacy.placeOrder(scanner);
                    break;
                case 4:
                    pharmacy.getTotalSales();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

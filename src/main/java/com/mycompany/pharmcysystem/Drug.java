/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pharmcysystem;

/**
 *
 * @author omarm
 */
public class Drug {
    String name, category;
    int id, quantity;
    double price;

    public Drug(String name, int id, double price, String category, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }
}

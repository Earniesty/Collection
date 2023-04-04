/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionfw;

import java.util.Objects;

/**
 *
 * @author Dell
 */
public class Drink {
    private String menu, category;
    private int price;

    public Drink(String menu, String category, int price) {
        this.menu = menu;
        this.category = category;
        this.price = price;
    }

    public Drink() {
    }

    public String getMenu() {
        return menu;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" + "menu=" + menu + ", category=" + category + ", price=" + price + '}';
    }
    
    public int compare(Drink o) {
        return this.getMenu().compareToIgnoreCase(o.getMenu());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.menu);
        hash = 53 * hash + Objects.hashCode(this.category);
        hash = 53 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Drink other = (Drink) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        return Objects.equals(this.category, other.category);
    }
    
    
    
}

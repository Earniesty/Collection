/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionfw;

/**
 *
 * @author Dell
 */
public class Country {
   private String name, nameEn;

    public Country(String name, String nameEn) {
        this.name = name;
        this.nameEn = nameEn;
    }

    public String getName() {
        return name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", nameEn=" + nameEn + '}';
    }
   
   
}

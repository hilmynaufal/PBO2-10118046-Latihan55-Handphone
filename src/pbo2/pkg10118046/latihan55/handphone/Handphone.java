/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan55.handphone;

import javafx.scene.effect.Light;

/**
 *
 * @author ASUS
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct() {
        System.out.println("Manufaktur: " + manufacture);
        System.out.println("OS: " + operatingSystem);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
    }
    
}

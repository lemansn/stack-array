/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev4;

/**
 *
 * @author leman
 */
public class Customer {

    private String ID; //musteri Id icin degisken
    private String adSoyad; // musteri ismi icin degisken

    //gerekli parametreleri icinde tutan yapici metot
    public Customer(String ID, String adSoyad) {
        this.ID = ID;
        this.adSoyad = adSoyad;
    }

    //parametreler icin get ve set metotlari yaziliyor
    public String getID() {
        return ID;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    
    //nesneyi bir string olarak gostermek icin toString metotu yaziliyor
    @Override
    public String toString() {
        return "ID: " + ID + ", Isim: " + adSoyad;
    }
    

}

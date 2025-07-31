/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Pata
 */
public class Kitapevi {

    public Kitapevi(String calisanAd, int calisanMaas, int yas) {
        this.calisanAd = calisanAd;
        this.calisanMaas = calisanMaas;
        this.yas = yas;
    }
    private String calisanAd;
    private int calisanMaas;

    public int getCalisanMaas() {
        return calisanMaas;
    }

    public void setCalisanMaas(int calisanMaas) {
        this.calisanMaas = calisanMaas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    private int yas;
    
    public String getCalisanAd(){
        return calisanAd;
    }
    public void setCalisanAd(String calisanAd){
        this.calisanAd= calisanAd;
    }
    
    private Kitap kitap;

    public Kitap getKitap() {
    return kitap;
    }

    public void setKitap(Kitap kitap) {
    this.kitap = kitap;
    }
    
    
}

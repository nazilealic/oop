/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Pata
 */
public class Kitap {
    private String isim;
    private String yazar;
    private int sayfaSayisi;
    
    public String getIsim(){
        return isim;
    }
    public void setIsim(String yeniIsim){
        this.isim=yeniIsim;
    }
    public String getYazar(){
        return yazar;
    }
    public void setYazar(String yeniYazar){
        this.yazar=yeniYazar;
    }
    public int getSayfaSayisi(){
        return sayfaSayisi;
    }
    public void setSayfaSayisi(int yeniSayfaSayisi){
        if (yeniSayfaSayisi<0){
            System.out.println("gecersiz sayfa sayisi!");
        }
        else{
        this.sayfaSayisi=yeniSayfaSayisi;
        }
    }
}

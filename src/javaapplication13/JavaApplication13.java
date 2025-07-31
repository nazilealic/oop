/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Pata
 */
public class JavaApplication13 {

  
    public static void main(String[] args) {
        Kitap k=new Kitap();
        k.setIsim("suc");
        k.setYazar("Dostoyevski");
        k.setSayfaSayisi(1289);
        
        Kitapevi kitapevi = new Kitapevi("Ahmet", 12000, 35);
        
        kitapevi.setKitap(k);

        System.out.println("Calisan Adi: " + kitapevi.getCalisanAd());
        System.out.println("Maasi: " + kitapevi.getCalisanMaas());
        System.out.println("Yasi: " + kitapevi.getYas());
        System.out.println("Calisanin ilgilendigi kitap: " + kitapevi.getKitap().getIsim());
        System.out.println("Kitabin yazari: " + kitapevi.getKitap().getYazar());
        System.out.println("Sayfa sayisi: " + kitapevi.getKitap().getSayfaSayisi());
    }
    
}

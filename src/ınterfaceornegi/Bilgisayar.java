/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınterfaceornegi;

/**
 *
 * @author Pata
 */
public class Bilgisayar implements ICihaz, Magza{
    @Override
    public void ac() {
        System.out.println("Bilgisayar acildi");
    }

    @Override
    public void kapat() {
        System.out.println("Bilgisayar kapandi");
    }
   

    @Override
    public void stokDurumu(int stok){
        System.out.println("Bilgisayar stogu : "+stok);
    }
    
}

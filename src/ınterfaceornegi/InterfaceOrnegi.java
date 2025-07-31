/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınterfaceornegi;

/**
 *
 * @author Pata
 */
public class InterfaceOrnegi {

    public static void main(String[] args) {
        Bilgisayar b = new Bilgisayar();
        Telefon t = new Telefon();
        t.ac();
        t.kapat();
        b.ac();
        b.kapat();
        t.stokDurumu(50);
        b.stokDurumu(47);
    }
    
}

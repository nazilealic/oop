/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınheritanceornek;

import java.util.Scanner;

/**
 *
 * @author Pata
 */
public class InheritanceOrnek {

   
    public static void main(String[] args) {
        Mudur mudur = new Mudur();
        Memur memur = new Memur();
        mudur.isim="Ayse";
        memur.isim="Ali";
        
        mudur.bilgiYazdir();
        memur.bilgiYazdir();
    }
    
}

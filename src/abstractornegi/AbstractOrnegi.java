/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractornegi;

/**
 *
 * @author Pata
 */
public class AbstractOrnegi {

    
    public static void main(String[] args) {
       Arac araba = new Araba();
       Arac bisiklet = new Bisiklet();
       
       araba.hareketEt();
       araba.dur();
       bisiklet.hareketEt();
       bisiklet.dur();
    }
    
}

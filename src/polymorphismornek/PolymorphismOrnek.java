/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphismornek;

/**
 *
 * @author Pata
 */
public class PolymorphismOrnek {

    
    public static void main(String[] args) {
        Hayvan kedi = new Kedi();
        Hayvan kopek = new Kopek();
        
        kedi.sesCikar();
        kopek.sesCikar();
    }
    
}

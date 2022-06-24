/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220624.ch5_4;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item();
        //i1.name = "P1";
        //i1.price = -1;
        i1.setName(null);
        i1.setPrice(25);
        i1.print();
    }
    
}

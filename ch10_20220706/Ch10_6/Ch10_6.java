/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220706.Ch10_6;

/**
 *
 * @author xvpow
 */
public class Ch10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RadioIF rif = new Radio();
        rif.close();
        rif.start();
    }
    
}

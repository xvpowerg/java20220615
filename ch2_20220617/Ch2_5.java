/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i =0;
        while( (i+=2) < 20 ){
            System.out.println(i);
        }
        String st1 = new String("AAA");
        String st2 = new String("AAA");
        System.out.println(st2 == st1);
    }
    
}

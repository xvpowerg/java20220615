/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220711.ch12_4;
import ch12_20220711.ch12_4.TestStaticInner.TestStaticClass;
/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestStaticInner.TestStaticClass tsc = 
                new TestStaticInner.TestStaticClass();
        tsc.print();
        TestStaticClass tsc2 = new TestStaticClass();
        tsc2.print();
        
    }
    
}

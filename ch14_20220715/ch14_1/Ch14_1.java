/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_1;

/**
 *
 * @author xvpow
 */
public class Ch14_1 {
    
    public static void main(String[] args) {
      
        TestIF1 tif1 = ()->{
        System.out.println("Test Lambda");
        };
        tif1.test();
        
        TestIF1 tif2 = ()->System.out.println("Test Lambda2");
        tif2.test();
         
    }
    
}

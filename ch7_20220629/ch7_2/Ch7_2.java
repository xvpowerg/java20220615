/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220629.ch7_2;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Modifier
       //public 跨package都可讀寫
       //protected 相同package可讀寫 或繼承後的子類別可讀寫
       //default相同package可讀寫
       //private相同類別可讀寫
       
       Test1 t1 = new Test1();
       System.out.println(t1.publicString);
       System.out.println(t1.protectedString);
       System.out.println(t1.defaultString);
    }
    
}

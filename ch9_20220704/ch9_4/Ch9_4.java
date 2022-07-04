/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220704.ch9_4;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1(10,"Test1");
        Test1 t2 = new Test1(10,"Test1");
        Test1 t3 = new Test1(15,"Test3");
        System.out.println(t1.equals(t2));
         System.out.println(t1.equals(t3));
         System.out.println(t1.equals(null));
         
         System.out.println(t3);
         
         //System.out.println(t3.getClass().getName()+"@"+Integer.toHexString(t3.hashCode()));
    }
    
}

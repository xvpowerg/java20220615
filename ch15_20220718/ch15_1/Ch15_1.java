/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_1;

/**
 *
 * @author xvpow
 */
public class Ch15_1 {

   enum Fruit{
       APPLE,
       BANANA,
       CHARRY
   }
    public static void main(String[] args) {
        System.out.println(Fruit.APPLE);
        System.out.println(Fruit.CHARRY);
        System.out.println(Fruit.CHARRY.getClass());
        System.out.println(Fruit.CHARRY.ordinal());
        System.out.println(Fruit.BANANA.name());
        
        
       Fruit c1 =  Fruit.valueOf("CHARRY");
       System.out.println(c1);
       System.out.println("=====================");
     Fruit[] fList =  Fruit.values();
     for (Fruit f1 : fList){
         System.out.println(f1);
     }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220727.ch19_2;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(7);
        
     Optional<Integer> op1 =    list.stream().reduce((a1,a2)->{
            System.out.println(a1+":"+a2);
            return a1+a2;
        });
     
     System.out.println(op1.get());
     System.out.println("=====================");
    int sum =  list.stream().reduce(0, (a1,a2)->{
         System.out.println(a1+":"+a2);
         return a1+a2;
     });
    System.out.println(sum);
       System.out.println("=====================");   
      int value =  list.stream().parallel().reduce(1, 
               (a1,a2)->{
                   System.out.println("a1:"+a1+" a2:"+a2);
                   return a1+a2;}, 
               (b1,b2)->{
                   System.out.println("b1:"+b1+" b2:"+b2);
                   return b1+b2;
                   });
    System.out.println(value);  
    }
    
}

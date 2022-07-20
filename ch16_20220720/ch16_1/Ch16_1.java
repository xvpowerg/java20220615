/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20220720.ch16_1;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     HashSet<Integer> set = new HashSet();
     set.add(10);
     set.add(7);
     set.add(10);
     set.add(9);
     set.add(2);
     set.add(7);
     set.forEach(v->System.out.println(v));
     
     Item item1 = new Item(10,"a1");
     Item item2 = new Item(20,"a2");
     Item item3 = new Item(40,"a3");
     Item item4 = new Item(50,"a4");
     Item item5 = new Item(20,"a2");
     
     System.out.println(item2.equals(item5));
     
     HashSet<Item> set2 = new HashSet();
     set2.add(item1);
     set2.add(item2);
     set2.add(item3);
     set2.add(item4);
     set2.add(item5);
     
     set2.forEach(it->System.out.println(it));
    }
    
}

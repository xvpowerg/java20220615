/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_4;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch15_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList();
        list.add(71);
        list.add(25);
        list.add(12);
        list.add(31);
        list.add(15);
        
        list.sort(Comparator.comparing(v->v));
      System.out.println(list);
      
      list.add(28);
      System.out.println(list);
      
      ArrayList<Integer> list2 = new ArrayList<>();      
      list2.add(201);
      list2.add(283);
      list2.add(277);
      list.addAll(list2);
      System.out.println(list);
      
      list.add(2,87);
      System.out.println(list);
      
      ArrayList<Integer> list3 = new ArrayList<>();      
      list3.add(315);
      list3.add(385);
      list3.add(366);
      
      list.addAll(8, list3);
      System.out.println(list);
      
     // list.remove(71);
      list.remove(Integer.valueOf(71));
      System.out.println(list);
      list.remove(3);
      System.out.println(list);
      ArrayList<Integer> del = new ArrayList();
      del.add(28);
      del.add(385);
       del.add(277);
      list.removeAll(del);
      System.out.println(list);
     
      list.removeIf(v->v%2 == 0);
        System.out.println(list);
     list.replaceAll(v->v>50?v*2:v);
        System.out.println(list);
    }
    
}

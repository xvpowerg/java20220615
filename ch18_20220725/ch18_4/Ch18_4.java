/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_4;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
         list.add("Vivin");
        list.add("Lindy");
        list.add("Ken");       
        list.add("Iris");
        list.add("Joy");
        boolean b1 = list.stream().allMatch(v->v.length() > 2);
        System.out.println(b1);
        boolean b2 = list.stream().anyMatch(v->v.equals("Lindy"));
        System.out.println(b2);
        boolean b3 = list.stream().noneMatch(v->v.length() > 10);
        System.out.println(b3);
        // 有條件不成立短路 回傳false
      b1 =   list.stream().peek(System.out::println).allMatch(v->v.length() >3);
       System.out.println(b1);
       System.out.println("===============================");
       // 有條件成立短路 回傳true
       b2=  list.stream().peek(System.out::println).anyMatch(v->v.length() < 4);
        System.out.println(b2);
          System.out.println("===============================");
           // 有條件成立短路 回傳false
      b3=  list.stream().peek(System.out::println).noneMatch(v->v.length() < 4);
      System.out.println(b3);
    }
    
}

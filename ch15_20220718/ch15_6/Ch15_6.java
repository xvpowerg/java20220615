/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_6;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch15_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList();
       list.add("Ken");
       list.add("Viivn");
       list.add("Lucy");
       list.add("Joy");
       
       list.forEach(v-> System.out.println(v));
       
       list.addFirst("First");
       list.addLast("Last");
       
       System.out.println(list);
       
       System.out.println(list.pollFirst());//會移除First or Last
       System.out.println(list.pollLast());
        System.out.println(list);
        
        System.out.println(list.peekFirst());//不會移除First or Last
        System.out.println(list.peekLast());
        
         System.out.println(list.pop());
          System.out.println(list.pop());
            System.out.println(list);
    }
    
}

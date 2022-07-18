/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_7;
import java.util.HashSet;
import java.util.ArrayList;
public class Ch15_7 {

    public static void main(String[] args) {
        // 不可重複
        ArrayList<String> list = new ArrayList();
        list.add("Z");
        list.add("X");
        list.add("B");
        list.add("Y");
        
        HashSet<String> set = new HashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("D");
        set.add("C");
        for (String v : set){
            System.out.println(v);
        }
        
        System.out.println(set.contains("C"));
        System.out.println(list.contains("X"));

    }
    
}

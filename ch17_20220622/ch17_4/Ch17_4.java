/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_4;
import java.util.TreeMap;
import java.util.Comparator;

public class Ch17_4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Comparator<Integer> cp= Comparator.comparing(v->v);        
        TreeMap<Integer,String> map = new TreeMap(cp.reversed());
        map.put(70, "Ken");
        map.put(65, "Vivin");
        map.put(82, "Iris");
        map.put(31, "Ken");
        map.put(27, "GIgi");
        
        map.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}

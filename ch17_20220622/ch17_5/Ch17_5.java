/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_5;
import java.util.ArrayList;

public class Ch17_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(17);
        list.add(13);
        list.add(18);
        list.add(27);
        
        list.stream().
                filter(v->v%2 == 0).
                forEach(v->System.out.println(v));
        
        
        
    }
    
}

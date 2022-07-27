/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220727.ch19_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();  
          list.add("Ken");
          list.add("Vivin");
          list.add("Lucy");
          list.add("Iris");
          list.add("Joy");
//         List<String> myList =  
//                 list.stream().filter(v->v.length() > 3).collect(Collectors.toList());
        // System.out.println(myList);
    ArrayList<String> myList =  
                 list.stream().filter(v->v.length() > 3).collect(Collectors.toCollection(ArrayList::new));
         System.out.println(myList);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220727.ch19_5;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch19_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();  
          list.add("Ken");
          list.add("Vivin");
          list.add("Ben");
          list.add("Sean");
//       Map<Integer,String> dataMap =
//               list.stream().collect(Collectors.toMap((v)->v.length(), (v)->v));
//       System.out.println(dataMap);

Map<Integer,String> myMap = list.stream().collect(Collectors.toMap((v)->v.length(),
        (v)->v, (v1,v2)->{
                 System.out.println(v1+":"+v2);            
                return v1+"-"+v2;
                }                
                ));
     System.out.println(myMap);
    }
    
}

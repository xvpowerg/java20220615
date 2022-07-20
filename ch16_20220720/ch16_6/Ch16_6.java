/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20220720.ch16_6;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch16_6 {

    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap();
       map.put("Ken", 100);
       map.put("Vivin", 82);
       map.put("Lucy", 94);
       map.put("Iris", 73);
      // map.put("Ben", 73);
       Integer v1 = map.get("Lucy");
       System.out.println(v1);
       //containsKey 查看key是否存在
       if (map.containsKey("Ben")){
              int v2 = map.get("Ben");
                System.out.println(v2);
       }
    
       
       int count =  0;
       for (String k : map.keySet()){
           count++;
           System.out.println(count+":"+k+":"+map.get(k));
       }
       
        map.forEach((k,v)->System.out.println(k+":"+v));        
        
    }
    
}

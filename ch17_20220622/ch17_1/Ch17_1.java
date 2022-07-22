/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_1;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch17_1 {


    public static void main(String[] args) {
      
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken", 100);
        map.put("Vivin", 72);
        map.put("Lucy", 83);
        map.put("Iris", 91);
       //if (!map.containsKey("Vivin")) map.put("Vivin", 82);
       map.putIfAbsent("Lucy", 62);//Key不存在加入
       map.putIfAbsent("Join", 73);
       System.out.println(map);
       //Key不存在新增
       //Key存在合併
       map.merge("Ken", 61, (v1,v2)->{
           System.out.println(v1+":"+v2);
       return v1 + v2;
       });
       map.merge("Sean",85, (v1,v2)->{
           System.out.println(v1+":"+v2);
         return v1 + v2;
       });
         System.out.println(map);
    }
    
}

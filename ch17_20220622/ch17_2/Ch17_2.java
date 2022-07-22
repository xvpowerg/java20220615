/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken", 100);
        map.put("Vivin", 72);
        map.put("Lucy", 83);
        map.put("Iris", 91);
        //key存在會執行
        map.compute("Vivin", (k,v)->{
            if (k.equals("Vivin")){
                v += 20;
            }
            System.out.println(k+":"+v);
            return v;});
        System.out.println(map);
          //key存在 不會執行
        map.computeIfAbsent("Lucy", (k)->{
            System.out.println("computeIfAbsent:"+k);
            return 35;
        });
        map.computeIfPresent("Iris", (k,v)->{
            System.out.println("computeIfPresent:"+k+":"+v);
            return  v *2;
        });
        System.out.println(map);
        //key不存在 會執行
           map.compute("Gigi", (k,v)->{
            System.out.println("key不存在 compute:"+k+":"+v);
            return 67;});
        System.out.println(map);
          //key不存在 會執行
        map.computeIfAbsent("Ben", (k)->{
            System.out.println("computeIfAbsent:"+k);
            return 35;
        });
        System.out.println(map);
        //key不存在 不會執行
        map.computeIfPresent("May", (k,v)->{
            System.out.println("computeIfPresent:"+k+":"+v);
            return  v *2;
        });
    }
    
}

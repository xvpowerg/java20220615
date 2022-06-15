/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220615;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        var count = 0;
        ++count;
        System.out.println(count);
        ++count;
        System.out.println(count);
        
        var i = 0;
        //先加完1再處理其他的事情
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println("===================");
        //先處理其他的事情再加1
        var x = 0;
        System.out.println(x++);
        System.out.println(x);
        System.out.println("===================");
        var y = 0;
        var ans = 2 + ++y + y++ +3 + y++;
        //        2 + 1   + 1 + 3  + 2
        System.out.println(ans);
        System.out.println(y);
        
       float f1 = 10.2f;
       int v1 = 6;
//        v1 = v1 + f1;
        v1 += 2;
        v1 = v1 + 3;
        System.out.println(v1);
       v1 += f1; 
        System.out.println(v1);
    }
    
}

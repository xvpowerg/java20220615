/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220615;

/**
 *
 * @author xvpow
 */
public class Ch1_5 {

    public static void main(String[] args) {
        
        //boolean 短路
        //and && 左為flase就短路
        //or  || 左為true就短路
        int count = 0;
        
        var x=10;
        var y =20;
        boolean b1 = x > y && ++count > 0;
        System.out.println(count);
        int count2 = 0;
        boolean b2 = x < y || ++count2 > 0;
        System.out.println(count2);
        
        
        
    }
    
}

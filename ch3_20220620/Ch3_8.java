/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;

import javax.swing.JButton;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //wrapper  表示把基本型態轉變成專代表此基本型態的物件
       //基本型態　物件類型
        /*
          byte     Byte
          short    Short
          int      Integer
          long      Long
          float     Float
          double    Dobule
          char      Character
          boolean    Boolean     
       */
        //wrapper 
        //Boxing
        int x = 10;
       Integer intObj =  Integer.valueOf(x);
       //unBoxing
        int y = intObj.intValue();
        System.out.println(y);
       
        //auto boxing
        Integer intObj2 = 25;
        //auto unboxing
        int z = intObj2;
        int a1 = intObj2 + 5;
        System.out.println(z);
        System.out.println(a1);
        
        
       
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220615;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*整數
        浮點數
        字元
        布林*/       
        //整數
        byte b1 = 12;//-128~127
        short s1 = 128;//-32768~32767
        int v = 12345;//-2147483648 ~ 2147483647 預設
        long count = 56789;// 
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(v);
        System.out.println(count);
        //浮點數
        float f1 = 3.141f;
        double d1 = 2.71828;
        System.out.println(f1);
        System.out.println(d1);
        //字元 0~65535 無負數
        char c1 = 'B';
        System.out.println(c1);
        char c2 = 99;
        System.out.println(c2);
        // 布林
        boolean isOpen = true;
        System.out.println(isOpen);
        boolean isOdd = false;
        System.out.println(isOdd);
        //var 依照右邊的類型決定 變數的型態 只能用於區域變數
        var x1 = 10;
        var str = "Howard";
        System.out.println(x1);
        System.out.println(str);
        //變數名稱 
        //變數開頭必須是 字母 _ 或＄
        //變數第二個字開始是 字母 _ 或＄或數字
        var $1_2_3 = 1.245;
        System.out.println($1_2_3);
        var _myChar = 'A'; 
        System.out.println(_myChar);
        
    }
    
}

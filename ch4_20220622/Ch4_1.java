/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220622;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Integer value1 = null;
//        int ans =value1 + 2;
//        System.out.println(ans);
        //整數轉字串
        int number1 = 250;
        String intStr = String.valueOf(number1);
        System.out.println(intStr);
        //字串轉整數
        int number2 = Integer.parseInt("123");
        System.out.println(number2);
        System.out.println(number2 + 17);
        
        int number3 = Integer.parseInt("123 ".trim());//trim 移除頭尾空白
        // int number4 = Integer.parseInt("123 ");//java.lang.NumberFormatException
        System.out.println(number3);
        
        String bstr = Integer.toBinaryString(231);//轉2進為格式的字串
        String hsStr = Integer.toHexString(231);//轉16進為格式的字串
        String octStr = Integer.toOctalString(231);//轉8進為格式的字串
        System.out.println(bstr);
        System.out.println(hsStr);//
        System.out.println(octStr);
    }
    
}

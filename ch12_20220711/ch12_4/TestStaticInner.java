/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220711.ch12_4;

/**
 *
 * @author xvpow
 */
public class TestStaticInner {
    private int value = 20;
    private static String msg = "ABC";
    static class TestStaticClass{
        public void print(){
            //不可呼叫非static的外部方法或屬性
            //System.out.println(value);            
            System.out.println(msg);
        }
     }
}

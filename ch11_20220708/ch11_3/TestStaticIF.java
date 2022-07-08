/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20220708.ch11_3;

/**
 *
 * @author xvpow
 */
public interface TestStaticIF {
    default void testDefault(){
        System.out.println("testDefault");
    }
    //當不需要呼叫目前介面抽象方法時
    static void testStatic(){
        System.out.println("testStatic");
    }
}

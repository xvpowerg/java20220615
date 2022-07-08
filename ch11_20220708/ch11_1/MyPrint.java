/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20220708.ch11_1;

/**
 *
 * @author xvpow
 */
public interface MyPrint {
    String print();
    //通常default 是想呼叫 介面內的抽象方法
    //預設public
     default void showMsg(){
        System.out.println(print());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20220713.ch13_3;

/**
 *
 * @author xvpow
 */
public class Ch13_3 {

    /*
     遮蔽看類別
     複寫看物件
     
     靜態的方法或所有屬性 都是遮蔽
      
    */
    public static void main(String[] args) {
      Test2 t2 = new Test2();
      System.out.println(t2.value1);
      t2.printV1();
    }
    
}

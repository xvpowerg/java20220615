/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20220713.ch13_4;

/**
 *
 * @author xvpow
 */
public class Ch13_4 {

    /*
     遮蔽看類別
     複寫看物件
     
     靜態的方法或所有屬性 都是遮蔽
      
    */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        t1.func1();
        t1.func2();
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch11_20220708.ch11_4;

/**
 *
 * @author xvpow
 */
//因為TestIF2 與 TestIF1都有myDefault 所以會出問題
//public interface TestIF4 extends TestIF2,TestIF1 {
//    
//}
//在子介面複寫重複的方法
//TestIF2 繼承 TestIF1
public interface TestIF4 extends TestIF1, TestIF2 {
        public default void myDefault(){
            System.out.println("TestIF4!");
        }
}

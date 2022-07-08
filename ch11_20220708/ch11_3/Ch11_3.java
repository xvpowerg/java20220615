/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220708.ch11_3;

/**
 *
 * @author xvpow
 */
public class Ch11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestClass tc = new TestClass();
      tc.testDefault();
      //Static 方法必須直接使用介面呼叫
      TestStaticIF.testStatic();
    }
    
}

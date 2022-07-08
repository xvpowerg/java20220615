/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220708.ch11_4;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //default 方法會被繼承
         Test1Class  test1 = new Test1Class();
         test1.myDefault();
         TestIF1 tif1 = new Test2Class();
         tif1.myDefault();
         
         TestStaticIF1.testStatic();
         
    }
    
}

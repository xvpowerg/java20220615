/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220629.ch7_2_2;
import ch7_20220629.ch7_2.Test1;
/**
 *
 * @author xvpow
 */
public class Ch7_2_2 {

    public static void main(String[] args) {
        //跨package 讀取類別必須import
        Test1 t1 = new Test1();
        System.out.println(t1.publicString);
        Test2 t2 = new Test2();
        t2.testProtectedValue();
    }
    
}

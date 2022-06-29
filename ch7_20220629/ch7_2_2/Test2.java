/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220629.ch7_2_2;
import  ch7_20220629.ch7_2.Test1;
/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    void testProtectedValue(){
        System.out.println(this.protectedString); 
    }
    void test2(){
       Test1 t1 = new Test1(); 
       //t1.protectedString ="10";//錯誤
    }
}

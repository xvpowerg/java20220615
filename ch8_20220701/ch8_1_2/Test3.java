/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_1_2;
import ch8_20220701.ch8_1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3  extends Test1{
    @Override
    public void publicMethod(){
        System.out.println("Test3 publicMethod");
    }
    @Override
    protected void protectedMethod(){
    System.out.println("Test3 protectedMethod");
    }
    //無法Override
     void defaultMethod(){
        System.out.println("Test3 defaultMethod");
    }
}

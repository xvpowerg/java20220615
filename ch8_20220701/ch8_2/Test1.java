/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_2;

/**
 *
 * @author xvpow
 */
public class Test1{
    public int intMethod(){
        System.out.println("Test1 intMethod");
        return 10;
    }
    public Test1 testMethod(){
        System.out.println("Test1 testMethod");
        return new Test1();
    }
    
    public void testParaMethod(int v1){
        System.out.println("Test1 testParaMethod");
        
    }
}

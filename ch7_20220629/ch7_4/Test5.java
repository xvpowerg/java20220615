/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220629.ch7_4;

/**
 *
 * @author xvpow
 */
public class Test5 {
    public Test5(int v){
        System.out.println("Public Test5(v)");
    }
    
    protected Test5(String str){
        System.out.println("protected Test5(String)");
    }
    Test5(){
        System.out.println("default Test5()");    
    }
    //不讓你new
    private Test5(float v1){
        System.out.println("Test5(float v1)");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_5;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(int v1,String st){
        System.out.println("int String");
    }
    Test1(int v1,int v2){
        this(v1,v2+"");
        System.out.println("int:"+v1+" int:"+v2);
    }
    Test1(){
        this(10,20);
        System.out.println("Test()");
    }
    
}

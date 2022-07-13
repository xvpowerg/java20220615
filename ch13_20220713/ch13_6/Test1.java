/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20220713.ch13_6;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String[] array = new String[10000];
    private String name;
    //初始化區塊
    {
        for (int i= 0;i < array.length;i++){
            array[i] = "";
        }
    }
    Test1(){
        
    }
    
    Test1(String name){
       // this();
        this.name = name;
    }
    
    public void test(){
        if (array[5].length() > 3){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}

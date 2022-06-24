/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220624;

public class Ch5_1 {
    /*
     一樣類型
     相同類型可相容
     不同類型可相容 
     轉型boxing    
     錯誤
    */
    
    static void test1(int v1){
        System.out.println("int Test1 V1");
    }
    static void test1(short s1){
        System.out.println("short Test1 S1");
    }
    //   相同類型可相容
    static void test2(float f1){
        System.out.println("float Test2");
    }
    static void test2(long v1){
        System.out.println("long Test2");
    }
    // 不同類型可相容 
    static void test3(float f1){
        System.out.println("test3 float ");
    }
    
    static void test3(short s1){
        System.out.println("test3 short ");
    }
    
    static void test4(Integer v1){
        System.out.println("Integer test4");
    }
    static void test4(byte b1){
        System.out.println("byte test4");
    }
    
    static void test5(Float f1){
        System.out.println("Float test5");
    }
     static void test5(short s1){
        System.out.println("short test5");
    }
    public static void main(String[] args) {
       
        test1(2);        
        test2(12);
        test3(1);
        test4(25);
       //test5(5);//錯誤因為Float 無法相容Integer
//        String str = null;
//        System.out.println(str.equals(""));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220624;

    /*
     一樣類型
     相同類型可相容
     不同類型可相容 
     轉型boxing    
     錯誤
    */
public class Ch5_2 {
    //多參數規則一樣 注意不確定該選哪個方法的狀況
    static void test1(int a1,float f1){
        System.out.println("test int float");
    }
    
    static void test1(short s1,int v2){
        System.out.println("test1 short int");
    }
    
    
    static void test2(int v1,float f1){
        System.out.println("Test2 int float");
    }
    static void test2(float f1,int v1){
        System.out.println("Test2 float int");
    }
    public static void main(String[] args) {
      test1(1,2);
     // test2(1,2);//不確定該選哪個方法的狀況        
    }
    
}

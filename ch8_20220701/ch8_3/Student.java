/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_3;
import java.lang.IllegalArgumentException;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    Student(String name,int age){
        this.name = name;
       setAge(age);
    }
    
    public void setAge(int age){
        //檢查年齡區間 10~200
        //輸出錯誤的年齡
        if (age < 10 || age > 200){
            System.out.println("錯誤的年齡");
            //拋出例外
          throw new IllegalArgumentException();
        }
        this.age = age;
    }
    public void print(){
        System.out.println(this.name+":"+age);
    }
}

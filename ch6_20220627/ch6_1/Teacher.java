/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_1;

/**
 *
 * @author xvpow
 */
public class Teacher  extends Person {
        Teacher(){}
        Teacher(String name,int age,float height){
            super(name,age,height);
        }
        
     public void print(){
         System.out.print("Teacher:");
         super.print();
     }  
}

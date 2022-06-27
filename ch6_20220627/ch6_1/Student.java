/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_1;

/**
 *
 * @author xvpow
 */
public class Student extends  Person{
      Student(){}
      Student(String name,int age,float height){
          //呼叫父類別的建構式
          super(name,age,height);
          //this()呼叫同一類別的建構式 
          //this() super() 不會同時出現
          //因為this() 與 super()必須是第一行命令
//          setName(name);
//          setAge(age);
//          this.setHeight(height);
          
      }
      //複寫 Override
      
      public void print(){
          System.out.print("Student:");
          //呼叫父類別能看見的東西
          super.print();
      }
}

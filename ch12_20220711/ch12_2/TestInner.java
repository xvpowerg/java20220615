/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220711.ch12_2;

/**
 *
 * @author xvpow
 */
public class TestInner {
     // 內部類可加強類別的封裝效果
   private class SubClass{
       String msg;
       public SubClass(String msg){
           this.msg = msg;
       }
        public String toString(){
            return "SubClass:"+msg;
        }
    }
   
   void printSubClass(){
       SubClass sub = new SubClass("MyMssage");
       System.out.println(sub);
   }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_1;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    // 對方法檢查override是否正確
   @Override 
   public void publicMethod(){
        System.out.println("publicMethod Test2");
    }  
    @Override 
   //public 
   protected void protectedMethod(){
       System.out.println("protectedMethod Test2");
   }
   //public
   //protected
     @Override 
    void defaultMethod(){
       System.out.println("defaultMehtod Test2");  
    }
    //private 不能override
     //@Override 
     void privateMethod(){
        System.out.println("privateMethod Test2");
    }
}

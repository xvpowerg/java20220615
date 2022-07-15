/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20220715.ch14_2;

/**
 *
 * @author xvpow
 */
public class Ch14_2 {
     public static void main(String[] args) {
         TestIF2 tIF2_1= (String msg)->{
         System.out.println("TestIF2:"+msg);
         };
         tIF2_1.test("Hello!!");
         
         TestIF2 tIF2_2 = (msg)->{System.out.println("TestIF2:"+msg);};
         tIF2_2.test("Msg2");
         
        TestIF2 tIF2_3=msg->{System.out.println("TestIF2:"+msg);};
        tIF2_3.test("Msg3");
        
        TestIF2 tIF2_4 = msg->System.out.println("TestIF2:"+msg);
         tIF2_4.test("Msg4");     
     }
}

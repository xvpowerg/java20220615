/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_2;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1 {
         @Override
        public int intMethod(){
            System.out.println("Test2 intMethod");
            return 20;
        }
        @Override
        public Test2 testMethod(){
            System.out.println("Test2 testMethod");
            return new Test2();
        }
        //不會出錯 但不是Override!
        public void testParaMethod(long v1){
        System.out.println("Test1 long testParaMethod");
        
    }
}

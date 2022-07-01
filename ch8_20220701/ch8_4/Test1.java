/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_4;

/**
 *
 * @author xvpow
 */


public class Test1 {
    //throws 可能會拋出的例外
    //throw 確定拋出的例外
    public void testException(int value)throws Exception{
        if (value > 10){
            throw new Exception();
        }
    }
    
    public void testRuntimeException(String value){
        if (value==null || value.isEmpty()){
            throw new RuntimeException();
        }
        System.out.println("value:"+value);
    }
    
}

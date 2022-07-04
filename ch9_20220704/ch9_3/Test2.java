/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_3;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    //throws 可以是 子類 一樣 或不拋出 或某種RuntimeException
    public void testException()throws MyExceptionSub{
        throw new MyExceptionSub();
    }
    
//    public void testException()throws IOException{
//        throw new MyExceptionSub();
//    }
}

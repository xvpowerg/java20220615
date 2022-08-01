/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20220801.Ch21_4;

/**
 *
 * @author xvpow
 */
public class MyClose implements AutoCloseable {
    private boolean throwException = false;
    private String name;
    MyClose(String name,boolean throwException){
        this.throwException  =  throwException;
        this.name =  name;
    }
     public void close() throws Exception{
         System.out.println("Close:"+this.name);
         if (throwException)  throw new  RuntimeException(this.name+":例外");
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20220701.ch8_5;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testFileNotFoundException(int v)throws FileNotFoundException{
        if (v==2){
            throw new FileNotFoundException("Test1 FileNotFoundException ");
        }
        System.out.println("Test1 testFileNotFoundException");
    }
    public void testIOException(int v) throws IOException{
        
        if (v == 1){
            throw new IOException();
        }
        System.out.println("testIOException!!:"+v);
    }
}

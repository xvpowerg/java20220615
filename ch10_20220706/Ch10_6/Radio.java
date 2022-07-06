/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220706.Ch10_6;

/**
 *
 * @author xvpow
 */
public class Radio implements RadioIF {
    public void close(){
        System.out.println("Radio Close!");
    }
    public int pause(){
        System.out.println("Radio Pause!");
           return 0;
    }
    
    public boolean play(){
          System.out.println("Radio Play!");
        return false;
    }
    public void start(){
         System.out.println("Radio Start!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220810;

/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println(Thread.currentThread().getName());
      Thread t1 = new Thread(()->{
      System.out.println(Thread.currentThread().getName());      
      });
      
      t1.start();
      Thread t2 = new Thread(()->{      
            System.out.println(Thread.currentThread().getName());
      });
      t2.start();
    }
    
}

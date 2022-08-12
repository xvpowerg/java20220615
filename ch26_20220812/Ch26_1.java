/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220812;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *
 * @author xvpow
 */
public class Ch26_1 {
    
    public static void main(String[] args) {
        ExecutorService exs =  Executors.newCachedThreadPool();
        
        for (int i =1 ;i <= 50;i++){
                exs.submit(()->{        
                      System.out.println(Thread.currentThread().getName());
                });
        }
        exs.shutdown();
        
    }
    
}

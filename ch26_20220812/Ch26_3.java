/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220812;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch26_3 {

    public static void main(String[] args) {
        Random ran = new Random();
//        ExecutorService es = Executors.newCachedThreadPool();
//      for (int i = 1;i<=10;i++){
//            es.submit(()->{            
//            System.out.println("Thread Start:"+Thread.currentThread().getName());
//                try{
//                      TimeUnit.SECONDS.sleep(ran.nextInt(10));
//                }catch(Exception ex){
//                }      
//             System.out.println("Thread End:"+Thread.currentThread().getName());   
//            });

      ExecutorService es = Executors.newFixedThreadPool(3);
      for (int i = 1;i<=10;i++){
            es.submit(()->{            
            System.out.println("Thread Start:"+Thread.currentThread().getName());
                try{
                      TimeUnit.SECONDS.sleep(ran.nextInt(10));
                }catch(Exception ex){
                }      
             System.out.println("Thread End:"+Thread.currentThread().getName());   
            });
      }  
      
      es.shutdown();
                
                
        
        
        
    }
    
}

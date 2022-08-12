/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220812;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch26_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
      ExecutorService es =  Executors.newCachedThreadPool();
    Future<Integer> fu = es.submit(()->{
       System.out.println("等待產生中.....");
       TimeUnit.SECONDS.sleep(3);
       int v =   random.nextInt(1000);
       return v;
       });
    
    try{
        System.out.println("準備取值....");
       Integer v =   fu.get();
       System.out.println("計算完成....");
       System.out.println(v);
    }catch(Exception ex){
         System.out.println(ex);
    }
    es.shutdown();
    }
    
}

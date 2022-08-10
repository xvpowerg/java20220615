/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220810;

/**
 *
 * @author xvpow
 */
public class Ch25_2 {
    private static Object lock= new Object();
    static class Test1{
        private int x = 0;
        public  void  run(){
            synchronized (lock) {
                 for (int i = 1;i<=10;i++){
                    System.out.println("Thread S:"+Thread.currentThread().getName());
                    x++;
                    System.out.println(x);
                    System.out.println("Thread E:"+Thread.currentThread().getName());
                }
            
            }
        
                   for(int j = 1; j<=100;j++){
                     System.out.println("J Thread :"+Thread.currentThread().getName());    
                }     
               
            
        }
//        public synchronized void  run(){
//           
//                for (int i = 1;i<=10;i++){
//                    System.out.println("Thread S:"+Thread.currentThread().getName());
//                    x++;
//                    System.out.println(x);
//                    System.out.println("Thread E:"+Thread.currentThread().getName());
//                }
//                
//                for(int j = 1; j<=5;j++){
//                     System.out.println("J Thread :"+Thread.currentThread().getName());    
//                }
//            
//        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        Thread th1 = new Thread(()->{
            
             t1.run();
        });
        Thread th2 = new Thread(()->{
        
             t1.run();
        });
       th1.start();
       th2.start();
        
    }
    
}

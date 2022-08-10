/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20220810;

/**
 *
 * @author xvpow
 */
public class Ch25_3 {
    
    static class TestLock{
        public synchronized void test1(TestLock lock){
            System.out.println("test1!");
            lock.test2();
        }
        
        public synchronized void test2(){
            System.out.println("test2!!!");
        }        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestLock tlock1 = new TestLock();
        TestLock tlock2 = new TestLock();
        
        Thread th1 = new Thread(()->{
            tlock1.test1(tlock2);        
        });
        Thread th2 = new Thread(()->{
          tlock2.test1(tlock1);        
        });
        
        th1.start();
        th2.start();
    }
    
}

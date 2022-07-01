/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220701.ch8_4;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        try{
          t1.testException(15);   
          System.out.println("testException!!");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        t1.testRuntimeException("Lucy");
        try{
            t1.testRuntimeException("");
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
         
      
    }
    
}

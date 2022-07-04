/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_2;

/**
 *
 * @author xvpow
 */
public class Ch9_2 {
    
        static void testFinally(){
            try{
                System.out.println("run testFinally");
               return;     
            }finally{
                System.out.println("TestFinally");
           }
        }
    
       public static void main(String[] args) {
     
          testFinally();
           
       }
}

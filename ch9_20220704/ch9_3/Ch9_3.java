/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220704.ch9_3;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 =  new Test2();
        try{
            t1.testException();
        }catch(MyException ex){
            System.out.println(ex);
        }
        
    }
    
}

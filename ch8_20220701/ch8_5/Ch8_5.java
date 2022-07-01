/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220701.ch8_5;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch8_5 {
    public static void main(String[] args) {
        // TODO code application logic here
        //FileNotFoundException 是 IOException 子類 所以 IOException 不能放在之上
         //越下越父
        Test1 t1 = new Test1();
        try{
          t1.testIOException(1);
          t1.testFileNotFoundException(2);    
          
        }catch(FileNotFoundException f){
            System.out.println("FileNotFoundException:"+f);
        }catch(IOException ex){
             System.out.println("IOException:"+ex);
        }finally{
          System.out.println("Ch8_5!");  
        }
      //finally 保證一定執行

    }
    
}

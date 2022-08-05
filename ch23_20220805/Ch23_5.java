/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 = Paths.get("C:","mydir");
      boolean isExists = Files.exists(p1);
      System.out.println(isExists);
      Path p2 = Paths.get("C:","mydirx");
      isExists =  Files.exists(p2);
      System.out.println(isExists);
      
      Path p3 = Paths.get("C:", "mydir","delete.txt");
//      try{
//            Files.delete(p3);    
//      }catch(IOException ex){
//          System.out.println(ex);
//      }
         try{
             boolean b = Files.deleteIfExists(p3);
             System.out.println(b);
         }catch(IOException ex){
           System.out.println(ex);   
         }
     
      
    }
    
}

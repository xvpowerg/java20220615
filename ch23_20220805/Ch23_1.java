/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 =  Paths.get("C:","mydir");
      System.out.println(p1);
      Path p2 = Paths.get("C:","A","B","C","D");
      System.out.println(p2.getFileName());
      System.out.println(p2.getParent());
      System.out.println(p2.getRoot());
      
      System.out.println(p2.subpath(0, 3));
      System.out.println(p2.getNameCount());
      System.out.println(p2.getName(2));
    
      Path p3 = Paths.get("A","1","2","3");  
       System.out.println(p3.getRoot());
       System.out.println(p3);
       System.out.println(p3.getNameCount());
       System.out.println(p3.getName(2));
       
       
       
       
    }
    
}

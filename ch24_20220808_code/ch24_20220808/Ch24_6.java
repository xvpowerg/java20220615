/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220808;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    public static void main(String[] args) {
     Path p1 =  Paths.get("c:","mydir","mydata.txt");
       Path p2 =  Paths.get("c:","mydir","mydata.txt");
       try{
            boolean isSame = Files.isSameFile(p1, p2);
            System.out.println(isSame);  
       }catch(IOException ex){
           System.out.println(ex);
       }

        
        
    }
    
}

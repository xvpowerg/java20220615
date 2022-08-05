/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        File file = new File("C:\\mydir\\test.zip");
        Path target = Paths.get("C:", "mydir","test_copy.zip");
        
        try{
           FileInputStream instream = new FileInputStream(file);
           Files.copy(instream, target,StandardCopyOption.REPLACE_EXISTING);
        }catch(FileNotFoundException ex){
           System.out.println(ex);
        }catch(IOException ex){
             System.out.println(ex);
        }
        
    }
    
}

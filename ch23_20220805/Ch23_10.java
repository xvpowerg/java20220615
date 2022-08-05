/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path src = Paths.get("c:", "mydir","mymsg.txt");
        Path target = Paths.get("c:", "mydir","dir","target.txt");
        try{
            Files.move(src, target,StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}

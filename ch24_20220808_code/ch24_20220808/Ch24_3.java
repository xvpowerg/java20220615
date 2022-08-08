/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220808;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 =  Paths.get("c:","mydir","dir");
        try{
            Stream<Path> stp  = Files.walk(p1, 2);
            stp.forEach(pah->System.out.println(pah));
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}

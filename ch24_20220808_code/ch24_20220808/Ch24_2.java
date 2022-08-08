/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20220808;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch24_2 {
    public static void main(String[] args) {
        
       Path p1=   Paths.get("c:","mydir","dir");
       try{
           Stream<Path> strP =   Files.walk(p1);
           //strP.forEach(ph->System.out.println(ph));
           long count = 
                   strP.filter(ph->ph.toString().contains(".txt")).count();
           System.out.println(count);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
}

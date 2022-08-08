/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Ch24_1 {

    public static void main(String[] args) {
        // TODO code application logic here
       Path p1 =  Paths.get("c:", "mydir","dir");
       try{
            Stream<Path> listP = Files.list(p1);
            //listP.forEach(f->System.out.println(f));
            listP.forEach(f->System.out.println(f.toString().contains(".txt")));
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}

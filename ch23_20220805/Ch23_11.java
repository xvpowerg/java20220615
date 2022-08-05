/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class Ch23_11 {
    public static void main(String[] args) {
      Path p1 =  Paths.get("c:","mydir","dir");
      try{
           Stream<Path> st =  Files.list(p1);    
           st.forEach(p->System.out.println(p));
      }catch(IOException ex){
          System.out.println(ex);
      }
      
    }
    
}

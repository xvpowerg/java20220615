/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Ch23_9 {
    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 = Paths.get("c:","mydir","mylist.obj");
        try(ObjectInputStream objIn  =
                new ObjectInputStream( Files.newInputStream(p1));){
            ArrayList<String> list =( ArrayList<String>)objIn.readObject();
            System.out.println(list);
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.io.ObjectOutputStream;
import java.io.IOException;

import java.util.ArrayList;


public class Ch23_8 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <String> list  = new ArrayList();
        list.add("Ken");
        list.add("Iris");
        list.add("Joy");
        Path p1 = Paths.get("c:","mydir","mylist.obj");
        
        try(ObjectOutputStream objstr = 
                new ObjectOutputStream(Files.newOutputStream(p1))){
            objstr.writeObject(list);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}

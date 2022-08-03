/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch22_5 {

    public static void main(String[] args)throws Exception  {
        // TODO code application logic here
        Person p1 = new  Person("Kne","Vivin");
        File f1= new File("C:\\mydir\\person.obj");
        
        try(ObjectOutputStream out =  
                new ObjectOutputStream(new FileOutputStream (f1));){
            out.writeObject(p1);
        }
        
        
    }
    
}

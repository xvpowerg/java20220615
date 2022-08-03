/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_3;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st = null;
       File file = new File("C:\\mydir\\student.obj");
       try(FileInputStream fIn = new FileInputStream(file);
           ObjectInputStream objIn = new  ObjectInputStream(fIn)   ){
          st = (Student)objIn.readObject();
       }catch(IOException | ClassNotFoundException ex){
           System.out.println(ex);
       }
       System.out.println(st);
    }
    
}

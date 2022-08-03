/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    File file = new File("C:\\mydir\\product.obj");
        try(FileInputStream fin = new FileInputStream(file );
             ObjectInputStream objIn = new  ObjectInputStream(fin);  ){
               Product pd = (Product )   objIn.readObject();
               System.out.println(pd);
        }catch(IOException | ClassNotFoundException ex){
               System.out.println(ex);
        }
    }
    
}

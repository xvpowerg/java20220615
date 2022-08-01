/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801;
import java.io.File;

import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File src= new File("C:\\mydir\\test.zip");
        File target = new File("C:\\mydir\\test_copy.zip");
         BufferedInputStream bfin =  null;
         BufferedOutputStream bout = null;
        try{

             bfin = 
                    new BufferedInputStream(new FileInputStream(src));      
             bout = 
                    new BufferedOutputStream(new FileOutputStream(target));
            int data = -1;
            while( (data = bfin.read())  != -1){
               bout.write(data);
            }
         
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
              System.out.println(ex);
        }finally{
            try{
                bout.close();
                bfin.close();   
            }catch(IOException ex){
                System.out.println(ex);
            }
             
        }
     
        
    }
    
}

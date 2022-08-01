/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File src = new  File("C:\\mydir\\mymsg.txt");
        File target = new File("C:\\mydir\\mymsg_copy.txt");
       
        try{
            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(target);
            int data = -1;
            while( (data = fin.read()) != -1){
                   fout.write(data);
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
        
        
    }
    
}

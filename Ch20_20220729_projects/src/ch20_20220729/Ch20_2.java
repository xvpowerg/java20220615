/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220729;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File src = new File("c:\\mydir\\mymsg.txt");
        File target = new File("c:\\mydir\\mymsg_copy.txt");
        try{
            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(target);
            int data = -1;
            while( (data = fin.read()) !=-1 ){
                fout.write(data);
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}

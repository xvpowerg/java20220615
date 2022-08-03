/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student("Ken",25);
        System.out.println(st1);
        File file = new File("C:\\mydir\\student.obj");
        try(FileOutputStream  fOut = new FileOutputStream(file);
            ObjectOutputStream oubOut = new  ObjectOutputStream(fOut);  ){
        oubOut.writeObject(st1);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}

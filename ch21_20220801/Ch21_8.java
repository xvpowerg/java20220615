/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch21_8 {

    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "myMessage";
        File file = new File("c:\\mydir\\testw.txt");
       try(BufferedWriter bfw = new BufferedWriter(new FileWriter(file))){
           bfw.write(msg);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}

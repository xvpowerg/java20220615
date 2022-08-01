/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch21_5 {
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\mydir\\mymsg.txt");
        try(FileReader fileReader = new FileReader(file);){
            int data = -1;
            while( (data =  fileReader.read()) != -1 ){
                System.out.print((char)data);
            }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}

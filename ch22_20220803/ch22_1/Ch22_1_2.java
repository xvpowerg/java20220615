/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch22_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //反序列化
        File file = new File("C:\\mydir\\myList.boj");
       try(FileInputStream fin = new FileInputStream(file);
           ObjectInputStream objIn = new ObjectInputStream(fin)    ){
            ArrayList<String> list = ( ArrayList<String>)objIn.readObject();
            System.out.println(list);
        }catch(FileNotFoundException | ClassNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}

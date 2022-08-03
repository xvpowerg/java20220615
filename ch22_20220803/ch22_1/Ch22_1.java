/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_1;
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Joy");
        list.add("Iris");
        //序列化 物件變檔案
       File file  = new File("C:\\mydir\\myList.boj");
       try(FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objOut = new   ObjectOutputStream(out) ){
           objOut.writeObject(list);
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
        
    }
    
}

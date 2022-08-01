/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801.ch21_6;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch21_6 {
//做一個類別 MyFileRead 可以填入編碼 也可以讀文字檔
  //預設是utf-8
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\mydir\\mymsg.txt");
        try(MyFileRead fr = new MyFileRead(file,"BIG5")){
            int data = -1;
            while((data = fr.read()) != -1){
                System.out.print((char)data);
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
//        try(InputStreamReader isr =
//                new InputStreamReader(new FileInputStream(file),"BIG5");){
//            int data = -1;
//            while((data = isr.read())  != -1){
//                System.out.print((char)data);
//            }
//            
//        }catch(FileNotFoundException ex){
//            System.out.println(ex);
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
        
        
    }
    
}

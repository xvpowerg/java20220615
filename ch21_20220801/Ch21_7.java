/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch21_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\mydir\\mymsg.txt");
      try(BufferedReader br = new BufferedReader(new FileReader(file))){
          String data = null;
          while( (data = br.readLine()) != null){
              System.out.println(data);
          }
          
      }catch(IOException ex){
          System.out.println(ex);
      }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220808;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path ph1 = Paths.get("c:","mydir","mydata.txt");
        try{
            Stream<String>stPh = Files.lines(ph1);      
           String dataStr = stPh.collect(Collectors.joining(" "));
           System.out.println(dataStr);
           //stPh.forEach(data->System.out.println(data));
        }catch(IOException ex){
            System.out.println(ex);
        }
      
        
        
    }
    
}

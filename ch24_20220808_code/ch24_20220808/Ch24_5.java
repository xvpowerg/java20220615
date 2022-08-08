/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220808;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

 static void splitData(String data){
     String[] d1 =   data.split(":");
     System.out.println(d1[0]);
     String[] prices =  d1[1].split(",");
     for (String p : prices){
         System.out.println(p);
     }
 }
 
 static Data toDataObj(String strData){
     Data data = new Data();
     String[] sp1 = strData.split(":");
     String[] sp2 =  sp1[1].split(",");
     data.setName(sp1[0]);
     for (String d : sp2){
         data.appendPrice(Integer.parseInt(d));
     }
     
     return data;
 }
    public static void main(String[] args) {
        Path p1 =   Paths.get("C:","mydir","mydata.txt");
        try{
              Stream<String> dataStr =   Files.lines(p1);
             // dataStr.forEach(Ch24_5::splitData);
            // List<Data>  dataList =  dataStr?????
             List<Data>  dataList =  dataStr.map(Ch24_5::toDataObj).
                     collect(Collectors.toList());
             System.out.println(dataList);
        }catch(IOException ex){
          System.out.println(ex);
       }
    }
    
}

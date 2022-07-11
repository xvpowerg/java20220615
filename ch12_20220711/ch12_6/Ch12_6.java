/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220711.ch12_6;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCollector coll = new MyCollector();
      List<String>  nList =   coll.toList(new Supplier<List<String>>(){
        public List<String> get(){
            return new LinkedList();
        }
        },"Ken","Vivin","Lucy");
      
      nList.forEach(new Consumer<String>(){
          public void accept(String str){
              System.out.println(str);
          }
      });
    }
    
}

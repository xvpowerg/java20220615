/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220708.ch11_2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     MyArrayList myArrayList =  new MyArrayList();
     myArrayList.add("Ken");
     myArrayList.add("Vivin");
     myArrayList.add("Lindy");
     System.out.println(myArrayList.get(2));
     System.out.println(myArrayList.size());
     for (String v : myArrayList){
         System.out.println(v);
     }
     
     myArrayList.forEach(new MyConsumer());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20220708.ch11_2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyConsumer implements Consumer<String> {
   public void accept(String st){
      System.out.println(st);
   }
}

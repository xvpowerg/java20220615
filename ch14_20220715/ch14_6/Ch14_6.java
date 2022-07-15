/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_6;
import java.util.function.Function;
public class Ch14_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String st1 = "abcd";
       
        System.out.println(st1.toUpperCase());
      //Function<String,String> f1 = v->v.toUpperCase();
        Function<String,String> f1 = String::toUpperCase;
        Function<String,Integer> f2 = String::length;
        System.out.println(f1.apply(st1));
       System.out.println(f2.apply(st1));
    }
    
}

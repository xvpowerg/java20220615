/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20220725.ch18_2;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Test1 {
   static <T> T testFunc1(T v){
      return v;
   } 
   
   static <T,R> R testFunc2(T v,
           Function<T,R> func){
       return func.apply(v);
   }
}

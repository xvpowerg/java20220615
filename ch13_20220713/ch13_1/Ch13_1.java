/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20220713.ch13_1;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch13_1 {

    static int mapStrToInt(Function<String,Integer> func,String value){
        return func.apply(value);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int len = mapStrToInt(new Function<String,Integer>(){
           public Integer apply(String v){                
               return v.length();
           }         
        },"ABCDEF");
        System.out.println(len);
    }
    
}

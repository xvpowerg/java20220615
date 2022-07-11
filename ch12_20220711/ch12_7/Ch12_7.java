/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220711.ch12_7;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch12_7 {
    
    static String filterToString(Predicate<String>p,String ... datas){
        StringBuilder sb = new  StringBuilder();
        
        for (String s : datas){
            if(p.test(s)) {
                sb.append(s);
                sb.append(" ");}            
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String result = filterToString(new Predicate<String>(){
                public boolean test(String s){
                    return s.length() > 3;
                }
        
        } ,"Vivin","Tom","Gigi","Joy","Iris");
        
        System.out.println(result);
    }
    
}

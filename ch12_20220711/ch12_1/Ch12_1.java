/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220711.ch12_1;
import java.util.function.Consumer;
public class Ch12_1 {
    
    static void forecahNames(Consumer<String> pCon, 
            String ... names){
        for (String s : names){
            pCon.accept(s);
        }
    }
    
    public static void main(String[] args) {
        Print2Consumer p2 = new Print2Consumer();
        forecahNames(p2,"Ken","Vivin","Lucy","Joy","Iris","Ben");
        Print2Consumer p3 = new Print2Consumer(3);
       forecahNames(p3,"Ken","Vivin","Lucy","Joy","Iris","Ben");
       
        forecahNames(new Consumer<String>(){
            public void accept(String v){
                System.out.print(v+",");
            }
        },"Ken","Vivin","Lucy","Joy","Iris","Ben");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_3;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = {"Ken","Lucy","Vivin","Joy"};
        //不可修改
        Stream<String> st1 = Stream.of(names);
        st1.filter(v->v.length() > 3).forEach(System.out::println);
        System.out.println(names.length);
        System.out.println("==============================");
        //不可重複使用
         //st1 = Stream.of(names);
        //st1.filter(v->v.length() < 4).forEach(System.out::println);
        //分為惰性lazy與終端terminal
        st1 = Stream.of(names);
        st1.filter(v->{
            System.out.println("filter");
        return true;
        }).count();
        
    }
    
}

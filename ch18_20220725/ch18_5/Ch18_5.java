/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_5;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
         list.add("Vivin");
        list.add("Lindy");
        list.add("Ken");
        list.add("Joy");
        list.add("Iris");
        list.add("Joy");
        list.add("Iris");
        
        long count = list.stream().count();
        System.out.println(count);
        list.stream().distinct().forEach(System.out::println);
        System.out.println("=============================");
        list.stream().limit(4).forEach(v->System.out.println(v));//只取4個
        System.out.println("=============================");
        list.stream().skip(2).forEach(v->System.out.println(v));//跳過前2個
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_8;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author xvpow
 */
public class Ch18_8 {

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
        Optional<String> opt =  list.stream().findFirst();
        opt.ifPresent(v->System.out.println(v));
    }
    
}

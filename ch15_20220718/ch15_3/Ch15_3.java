/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ken");
        arrayList.add("Vivin");
        arrayList.add("Lucy");
        arrayList.add("Iris");
        
        for (String s1 : arrayList){
            System.out.println(s1);
        }
        System.out.println("===========================");
        for (int i = 0;i < arrayList.size();i++){
            System.out.println(i+":"+arrayList.get(i));
        }
        System.out.println("===========================");
        arrayList.forEach(v-> System.out.println(v));
        
    }
    
}


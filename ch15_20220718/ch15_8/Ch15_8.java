/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_8;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch15_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random ran= new Random();
        for (int i = 1;i<=20;i++){
            arrayList.add(ran.nextInt(20));
        }        
        System.out.println(arrayList);
        HashSet<Integer> set = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(set);
        System.out.println(arrayList);
        
    }
    
}

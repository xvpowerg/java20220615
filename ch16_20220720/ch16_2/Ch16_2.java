/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20220720.ch16_2;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet<Integer> treeSet = new TreeSet();
       treeSet.add(8);
       treeSet.add(10);
       treeSet.add(5);
       treeSet.add(7);
       treeSet.add(6);
       treeSet.add(3);
       
       for (int v : treeSet){
           System.out.println(v);
       }
       System.out.println("===================================");
       int v1 = treeSet.higher(4);
       int v2 = treeSet.ceiling(4);
       System.out.println(v1+":"+v2);
        v1 = treeSet.higher(6);//>6
        v2 = treeSet.ceiling(6); //>=6
       System.out.println(v1+":"+v2);
       
               
       int v3 = treeSet.lower(8);//< 8
       int v4 = treeSet.floor(8);//<=8
       System.out.println(v3+":"+v4);
       
    }
    
}

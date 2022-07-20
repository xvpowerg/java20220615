/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20220720.ch16_3;

import java.util.TreeSet;
import java.util.Comparator;
public class Ch16_3 {
private static Comparator<Integer> descCmp =  new Comparator<>(){
    //小到大的狀況
    //如果v1 > v2 回傳正數
    //如果v1 < v2 回傳負數
    //如果v1 == v2 回傳0
    public int compare(Integer v1,Integer v2){
        if (v1 > v2){
            return -1;
        }else if(v1 < v2){
            return 1;
        }
        return 0;
    }
};
    static  TreeSet<Integer> sortDesc(TreeSet<Integer> treeSet){
        
         TreeSet<Integer> newTreeSet = new TreeSet(descCmp);
         newTreeSet.addAll(treeSet);     
        return newTreeSet;
         
    }
    
    public static void main(String[] args) {
       TreeSet<Integer> treeSet = new TreeSet();
       treeSet.add(8);
       treeSet.add(10);
       treeSet.add(5);
       treeSet.add(7);
       treeSet.add(6);
       treeSet.add(3);
       
       System.out.println(treeSet);
      treeSet = sortDesc(treeSet);
       System.out.println(treeSet);
    }
    
}

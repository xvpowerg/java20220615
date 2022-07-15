/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_5;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch14_5_2 {
    static ArrayList<Integer> toIntRandomList(Integer count){
        
         ArrayList<Integer> resultList = new ArrayList<>();
            Random rand = new Random();
            for (int i =1;i<=count;i++){
             resultList.add(rand.nextInt());
            }
            return resultList;
    }
    static void printValues(ArrayList<Integer> list){
        for (int v : list){
             System.out.println(v);
        }
       
    }
      static void printValues(int count ,Function<Integer,ArrayList<Integer>> f1,
                                    Consumer<ArrayList<Integer>> con){
          ArrayList<Integer> list =  f1.apply(count);
          con.accept(list);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        printValues(5,
                Ch14_5_2::toIntRandomList,
                Ch14_5_2::printValues);
    }
    
}

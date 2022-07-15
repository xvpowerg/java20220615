/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_5;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Random;

public class Ch14_5 {    
    
    static void printValues(int count ,Function<Integer,ArrayList<Integer>> f1,
                                    Consumer<ArrayList<Integer>> con){
          ArrayList<Integer> list =  f1.apply(count);
          con.accept(list);
    }
    //method reference
    public static void main(String[] args) {
     printValues(5, 
        count->{
            ArrayList<Integer> resultList = new ArrayList<>();
            Random rand = new Random();
            for (int i =1;i<=count;i++){
             resultList.add(rand.nextInt());
            }
            return resultList;
        },
        results->{        
            for(int data : results){
                System.out.println("Result:"+data);
            }
        }
        );
        
        
        Function<Integer,ArrayList<Integer>> f1 = count->{
            ArrayList<Integer> resultList = new ArrayList<>();
            Random rand = new Random();
            for (int i =1;i<=count;i++){
             resultList.add(rand.nextInt());
            }
            return resultList;
        };


        
    }
    
}

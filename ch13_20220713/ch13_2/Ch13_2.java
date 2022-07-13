/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20220713.ch13_2;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch13_2 {
        
    
    static void increment(UnaryOperator<Integer> op,int[] data){
        for (int i = 0;i < data.length;i++){
            data[i] = op.apply(data[i]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data1 = {1,2,3,4,5};        
        int[] data2 = {11,12,13,14};
        increment(new UnaryOperator<Integer>(){
              public Integer apply(Integer i){
                  return i  + 3;
              }  
        },data1);
        
        increment(new UnaryOperator<Integer>(){
            public Integer apply(Integer i){
                return i + -2;
            }
        },data2);
        
        for (int v : data1){
            System.out.print(v+ " ");
        }
        System.out.println();
        System.out.println("====================");
        for (int v : data2){
            System.out.print(v+ " ");
        }
    }
    
}

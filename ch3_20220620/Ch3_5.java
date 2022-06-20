/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch3_5 {

    public static void main(String[] args) {
       String[] names = new String[5];
       System.out.println(names[2]);
       Arrays.fill(names, "Empty");
        System.out.println(names[2]);
        
        int[] array2 = {1,2,3,4,5,6,7,8,9};
        int[] array2copy =  Arrays.copyOf(array2, 4);
        for (int v : array2copy){
            System.out.print(v+" ");
        }
        System.out.println("");
        int[] array3copy = Arrays.copyOfRange(array2, 2, 6);
        for (int v : array3copy){
            System.out.print(v+" ");
        }
        System.out.println("");
        
    }
    
}

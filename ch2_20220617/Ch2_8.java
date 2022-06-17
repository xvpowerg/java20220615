/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;
import java.util.Arrays;
public class Ch2_8 {
    public static void main(String[] args) {
      int[] socre = {80,75,63,94,51};
      
       //System.out.println(socre[1]);
       for (int i = 0;i<socre.length ;i++){
           System.out.println(i+":"+socre[i]);
       }
       
  System.out.println("====================");
        for (int x : socre){
            System.out.println(x);
        }
        System.out.println("====================");
        Arrays.stream(socre).forEach(System.out::println);
    }
    
}

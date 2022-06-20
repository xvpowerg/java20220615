/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;
import java.util.Arrays;
import java.util.Scanner;
public class Ch3_3 {
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sca = new Scanner(System.in);
//        System.out.println("請輸入:");
//        String aaa = sca.next();
//        System.out.println(aaa);
        int[] array1 = {6,13,18,2,15};
        Arrays.sort(array1);
        for (int v : array1){
            System.out.print(v+" ");
        }
        System.out.println();
        
       int index =  Arrays.binarySearch(array1, 13);
       System.out.println(index);
       //找不到分三情況
       //1 比所有都小 回傳-1
      int index2 =  Arrays.binarySearch(array1, 1);
      System.out.println(index2);
       //2 比所有都大 array 長度 + 1 * -1
      int index3 =  Arrays.binarySearch(array1,20);
       System.out.println(index3);
      //3 中間
      int index4 = Arrays.binarySearch(array1, 8);
       System.out.println(index4);
       

      
    }
    
}

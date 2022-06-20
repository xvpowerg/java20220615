/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

   
    public static void main(String[] args) {
      int[][] array2xn = new int[2][];
      array2xn[0] = new int[]{7,9,2};
      array2xn[1] = new int[2];
      
      for (int i= 0; i<array2xn.length ;i++){
          for (int k = 0; k < array2xn[i].length;k++){
              System.out.print(array2xn[i][k]+" ");
          }
             System.out.println();
      }
       //System.out.println(array2xn[0][0]);
        
    }
    
}

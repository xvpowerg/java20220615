/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

    public static void main(String[] args) {
        
        //int[] array2 = new int[10]
        //2 4 6 8 10 12 14 16 18 20 22 14
        
     int[][] array2x3 = new int[2][3];
     array2x3[0][1] = 25;
      array2x3[1][0] = 73;
      array2x3[1][2] = 89; 
      System.out.println(array2x3.length);
      System.out.println(array2x3[1].length);//col
      for (int row = 0; row < array2x3.length;row++){
          for (int col=0; col <array2x3[row].length ;col++){
              System.out.print(array2x3[row][col]+"　");
          }
          System.out.println();
      }
      
    }
    
}

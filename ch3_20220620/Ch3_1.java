/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] arra2x3 = {{5,8,9},
                          {7,3,6} };
       for (int i =0; i <arra2x3.length ;i++){
           for (int k = 0; k < arra2x3[i].length;k++){
               System.out.print(i+","+k+":"+arra2x3[i][k]+" ");
           }
            System.out.println();
       }
       
       System.out.println("==================================");
       for (int [] a1 : arra2x3){
           for (int v1 : a1){
               System.out.print(v1+" ");
           }
           System.out.println();
       }
        
    }
    
}

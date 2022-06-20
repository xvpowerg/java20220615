/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {
    
    public static void main(String[] args) {
        int[][][] array2xn = new int[2][][];
        array2xn[0] = new int[3][];
        array2xn[1] = new int[4][2];
        
        
        array2xn[1][2][1] = 15;
        System.out.println(array2xn[1][2][1]);
        System.out.println(array2xn[0][2][2]);
        
        
        
    }
    
}

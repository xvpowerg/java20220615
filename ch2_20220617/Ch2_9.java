/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {
    public static void main(String[] args) {
        /*
        陣列預設值 
        整數:0
        浮點數:0.0
        字元:空白字元
        布林:false
        其他:null
        */
      int[] array1 = new int[10];
        array1[6] = 9;
        array1[2] = 15;
        array1[8] = 71;
        
        for (int i = 0;i<array1.length ;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        
       array1 = new int[]{8,11,2};//[]不加長度
       for (int v : array1){
           System.out.println(v);
       }
    }
    
}

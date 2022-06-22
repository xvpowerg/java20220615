/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220622;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch4_6 {
    //overloading 多載
    //可減少方法名稱
    //可做給預設值的函數
    static String max(String[] array){
        if (array== null || array.length == 0){
            return "";
        }else if(array.length == 1){
            return array[0];
        }    
         Arrays.sort(array);
         return array[array.length - 1];
    }    
    
     //可做給預設值的函數
      static void test(int a,int b){
          test(a,b,1,2);
      }
    static void test(int a,int b,int c,int e){
        
    }
    static int max(int[] array){
        if (array== null || array.length == 0){
            return 0;
        }else if(array.length == 1){
            return array[0];
        }    
         Arrays.sort(array);
     return  array[array.length - 1] ;
    }
    public static void main(String[] args) {
        int[] value = {7,2,5,6,1};
        String[] strValue = {"E","D","F","B"};
        
     System.out.println(max(value));
        System.out.println(max(strValue));
        test(1,2);
        test(1,2);
        test(1,2);
        test(1,2);
        test(1,2);
    }
    
}

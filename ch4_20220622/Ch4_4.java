/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220622;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

 
    static void swap(int a1,int b2){
         int tmp = a1;
        a1= b2;
        b2 = tmp;
    }
    
    static void swap(int[] values){
         int tmp =  values[0];
          values[0] = values[1];
          values[1] = tmp;
    }
    
    public static void main(String[] args) {
      //所有基本型態都是call by values
        int a1  = 10;
        int b2 = 20;
        System.out.println(a1+":"+b2);
       swap(a1,b2);
        System.out.println(a1+":"+b2);
        
        //call by reference
        int[] values = {16,31};
        System.out.println(values[0]+":"+values[1]);
        swap(values);
       System.out.println(values[0]+":"+  values[1]);
        //String 不可修改Immutable 
       String st1 = "ken";
       String st2 = "ben";
       String tmp = st1;
       st1 = st2;
       st2 = tmp;
       System.out.println(st1+":"+st2);
       
          
    }
    
}

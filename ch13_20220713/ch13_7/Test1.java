/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20220713.ch13_7;
import java.util.ArrayList;

public class Test1 {
    private static ArrayList<Integer> list = new ArrayList();//填入1~100  
  static{
       for (int i = 1; i<=100;i++){
          list.add(i);
      }
      
  }
    
    Test1(){
      for (int i = 1; i<=100;i++){
          list.add(i);
      }
  }
    
    public static int getListNumber(int i){
        return list.get(i);
    }
}

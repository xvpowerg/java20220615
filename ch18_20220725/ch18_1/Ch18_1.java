/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch18_1 {
//泛型必須是Test1的子類
   static void test1( ArrayList<? extends Test1> list){
       //list.add(new Test1());
       for (Test1 t1 : list){
           System.out.println(t1);
       }
   }
   //泛型必須是Test2的父類別
   static void test3(ArrayList <? super Test2> list){
    //可以新增必須 Test2 或子類型
   list.add(new Test2());
   //可以取值 但類型必須是Object
   for(Object t : list){
   
   }
       
   }
    public static void main(String[] args) {
      ArrayList<Test1> list1 = new ArrayList();
      test1(list1);
      ArrayList<Test2> list2 = null;
       ArrayList<Test3> list3 = null;
      test1(list2);
      test1(list3);
      
      test3(list1);
      test3(list2);
     // test3(list3);//Test3不是Test2的父類別
    }
    
}

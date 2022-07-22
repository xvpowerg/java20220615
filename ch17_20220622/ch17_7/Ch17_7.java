/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_7;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch17_7 {

  static void testFunc(ArrayList<Test1> list){     
      list.add(new Test2());
  }
  //只能讀
  static void testFunc2(ArrayList<? extends Test1> list){
      Test1 t1 = list.get(0);
      //list.add(null);//null可新增
     // list.add(new Test1());//無法新增
  }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Test1> list1 = new ArrayList<>();
        testFunc(list1);
        Test1 t1 = new Test2();
       ArrayList <Test2> list2 = new ArrayList<>();
        //testFunc(list2);//泛型必須一樣的類型
        
        testFunc2(list2);
    }
    
}

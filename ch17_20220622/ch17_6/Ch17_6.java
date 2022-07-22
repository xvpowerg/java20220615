/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_6;

/**
 *
 * @author xvpow
 */
public class Ch17_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyList<String> myList = new MyList();
       myList.add("Ken");
       myList.add("Vivin");
       myList.add("Lucy");
       myList.add("Joy");
       myList.foreach(v->System.out.println(v));
       
      MyList<Integer> myList2 = new MyList();
      myList2.add(10);
      myList2.add(15);
      myList2.add(16);
      myList2.foreach(v->System.out.println(v));
    }
    
}



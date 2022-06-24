/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220624.ch5_5;

/**
 *
 * @author xvpow
 */
public class Ch5_5 {
      public static void main(String[] args) {
          Fruit f1 = new Fruit();
          f1.setName("Apple");
          f1.setSize(10);
          f1.setWeight(1.5f);
          f1.print();
          
          Fruit f2 = new Fruit("Kiwi",5,6.3f);
          f2.print();
          
          Fruit f3 = new Fruit("Charry",3);
          f3.setWeight(1.1f);
          f3.print();
      }
}

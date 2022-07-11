/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220711.ch12_5;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {
  private static class Dog extends Animal{
      public void bark(){
          System.out.println("汪汪");
      }
  }
    public static void main(String[] args) {
      Animal an = new Dog();
      an.bark();//汪汪
      int x = 10;
      //匿名內部類
      Animal an1 = new Animal(){
          public void bark(){
              //不可修改外部屬性
              //x++;
              System.out.println("喵喵");
          }
      };
      an1.bark();
    }
    
}

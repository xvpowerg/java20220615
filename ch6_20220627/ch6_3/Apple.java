/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_3;

/**
 *
 * @author xvpow
 */
public class Apple extends Fruit {
    Apple(String name,int price){
       super(name,price);     
    }
    Apple(int price){
       this("蘋果",price);     
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_3;

/**
 *
 * @author xvpow
 */
public class Fruit {
    private String name;
    private int price;
    Fruit(String name,int price){
        this.name = name;
        this.price = price;
    }    
    public void print(){
        System.out.println(name+":"+price);
        
    }
}

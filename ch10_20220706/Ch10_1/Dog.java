/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220706.Ch10_1;

/**
 *
 * @author xvpow
 */
public class Dog extends  Animal{
    public Dog(String name,float weight){
        super(name,weight);
    }
    public void bark(){
        System.out.println("汪汪");
    }
}

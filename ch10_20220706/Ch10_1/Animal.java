/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220706.Ch10_1;

/**
 *
 * @author xvpow
 */
//如果有抽象方法 類別必須為抽象類別
//類別為抽象類別 不一定有抽象方法
public abstract class Animal {
    private String name;
    private float weight;
    public Animal(String name,float weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return this.name+":"+this.weight;
    }
    public abstract void bark();
}

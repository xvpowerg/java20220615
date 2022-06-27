/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_1;

/**
 *
 * @author xvpow
 */
public class Person {
     private String name;
     private int age;
     private float height;
     
    Person(){     } 
    Person(String name,int age,float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public void print(){
        System.out.println(getName()+":"+getAge()+":"+getHeight());
    }
    
}

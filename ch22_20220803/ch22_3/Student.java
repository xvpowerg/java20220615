/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20220803.ch22_3;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Student implements Serializable {
    private String name;
    private int age;
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return this.getName()+":"+this.getAge();
    }
}

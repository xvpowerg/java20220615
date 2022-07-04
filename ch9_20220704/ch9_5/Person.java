/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_5;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Person)){
            return false;
        }
        Person tmp= (Person)obj;
        return this.age == tmp.age && 
                this.name.equals(tmp.name);
    }
    
    public String toString(){
        return this.name+":"+this.age;
    }
}

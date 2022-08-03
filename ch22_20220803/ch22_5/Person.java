/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20220803.ch22_5;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Person implements Serializable {
    private Parent p1;
    private String name;
    public Person(String name,String pName){
        this.name = name;
        p1 = new Parent(pName);
    }
    public String toString(){
        return this.p1.toString()+":"+this.name;
    }
}

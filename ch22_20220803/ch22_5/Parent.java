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
public class Parent implements Serializable {
    private String name;
    Parent(String name){
        this.name = name;
    }
    public String toString(){
        return "Parent:"+this.name;
    }
}

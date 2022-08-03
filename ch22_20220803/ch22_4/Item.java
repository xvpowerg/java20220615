/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20220803.ch22_4;

import java.io.Serializable;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    public Item(){
        
    }
    public Item(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

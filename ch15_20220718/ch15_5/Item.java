/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20220718.ch15_5;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Item)){
            return false;
        }
        Item tmp = (Item)obj;
        return this.id == tmp.id && this.name.equals(tmp.name);
    }
    Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return id+":"+name;
    }
}

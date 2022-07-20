/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20220720.ch16_1;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    
    public Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object obj){
        System.out.println("equals:"+obj);
        if (obj == null || !(obj instanceof Item) ){
            return false;
        }
        Item tmpIt = (Item)obj;
        
        return id == tmpIt.id && name.equals(tmpIt.name);
    }
    
    //equals一樣hashCode必須一樣
    public int hashCode(){
        System.out.println("hashCode:"+name);
       return id + this.name.hashCode();
    }
    
    public String toString(){
        return id+":"+name;
    }
}

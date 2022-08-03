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
public class Product extends Item  implements Serializable{
    private int   price;
    Product(String name,int price){
        super(name);
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public String toString(){
        return this.getName()+":"+this.getPrice();
    }
}

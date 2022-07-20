/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20220720.ch16_4;

/**
 *
 * @author xvpow
 */
public class Product  implements Comparable<Product>{
    private String name;
    private int price;
    
    public Product(String name,int price){
        this.name = name;
        this.price = price;
    }
       
   public int compareTo(Product p1){
       if (this.price > p1.price){
           return 1;
       }else if(this.price < this.price){
           return -1;
       }
      return p1.name.compareTo(name) ;
   } 
    public String toString(){
        return name+":"+price;
    }
}

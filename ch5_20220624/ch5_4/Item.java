/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220624.ch5_4;

/**
 *
 * @author xvpow
 */
public class Item {
    //長度必須大0 小於20 也不可null  
   private String name;
   private int price;
    void print(){
        System.out.println(getName()+":"+getPrice());
    }
    
    public void setName(String inName){
        if (inName == null || 
                inName.isEmpty() || inName.length() > 20 
                ){
            System.out.println("姓名不符合規格");
            return;
        }
        name = inName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setPrice(int inPrice){
        if(inPrice < 0 ||  inPrice > 100000){
            System.out.println("金額錯誤");            
            return;
        }
        price = inPrice;
    }
    public int getPrice(){
        return price;
    }
           
}

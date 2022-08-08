/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20220808;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Data {
    private String name;
    private  ArrayList<Integer> datas = new ArrayList();
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void appendPrice(int price){
        datas.add(price);
    }
    
    public String toString(){
        return name+":"+datas;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20220624.ch5_5;

/**
 *
 * @author xvpow
 */
//JavaBean
public class Fruit {
    private String name;
    private int size;
    private float weight;
    
    public Fruit(){
        System.out.println("Fruit()");
    }
    public Fruit(String name,int size){
        this(name,size,0);//可呼叫另一組建構式
    }
    public Fruit(String name,int size,float weight){
        setName(name);
        setSize(size);
        setWeight(weight);
    }
    
    public void setName(String inName){
        name = inName;
    }
    public String getName(){
        return name;
    }
    public void setSize(int inSize){
        size = inSize;
    }
    public int getSize(){
        return size;
    }
    
    public void setWeight(float inWeight){
        weight = inWeight;
    }
    public float getWeight(){
        return weight;
    }
    
    public void print(){
        System.out.println(name+":"+size+":"+weight);
    }
            
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_1;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int age;
    private float height;
    
    public void setName(String name){
        if (name == null || name.isEmpty()){
            throw new NameException("name空白的錯誤");            
        }
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeight(float height)throws HeightException{
        if (height <= 0 ||  height > 10000000){
            throw new HeightException("身高低於或高於標準");
        }
        this.height = height;
    }
            
    public void print(){
        System.out.println(this.name+":"+this.age+":"+this.height);
    }
}

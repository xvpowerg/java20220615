/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.beans2;
/**
 *
 * @author xvpow
 */
public class Car {
    private int door;
    private String name;

    public Car(int door, String name) {
        this.door = door;
        this.name = name;
     
    }

    @Override
    public String toString() {
        return "Car{" + "door=" + door + ", name=" + name + '}';
    }
    
    
}

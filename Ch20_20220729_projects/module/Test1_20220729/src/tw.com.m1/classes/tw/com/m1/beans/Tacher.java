/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.beans;

/**
 *
 * @author xvpow
 */
public class Tacher {
    private String id;
    private int type;

    public Tacher(String id, int type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tacher{" + "id=" + id + ", type=" + type + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_5;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item i1 = new Item(1,"A1");
        Item i2 = new Item(2,"B2");
        Item i3 = new Item(3,"C3");
        Item i4 = new Item(4,"E4");
        Item i5 = new Item(5,"F5");
        Item delI4 = new Item(4,"E4");
        System.out.println(delI4.equals(i4));
        ArrayList<Item> list = new ArrayList();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.remove(delI4);
        System.out.println(list);
    }
    
}


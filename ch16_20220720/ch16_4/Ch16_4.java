/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20220720.ch16_4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch16_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p1 = new Product("P1",100);
        Product p2 = new Product("P2",200);
        Product p3 = new Product("P3",200);
        Product p4 = new Product("P1",200);
        Product p5 = new Product("P2",200);
        TreeSet<Product> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);
        System.out.println(treeSet);
    }
    
}

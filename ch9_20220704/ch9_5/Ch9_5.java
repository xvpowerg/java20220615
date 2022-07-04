/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220704.ch9_5;

/**
 *
 * @author xvpow
 */
public class Ch9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Student("Ken",16,87);
        Person p2 = new Student("Ken",16,87);
        Person p3 = new Student("Iris",12,71);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        
        System.out.println(p1);//Ken:16:87
    }
    
}

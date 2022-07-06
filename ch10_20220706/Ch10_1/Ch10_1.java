/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220706.Ch10_1;

public class Ch10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     Animal a1 = new Animal("momo",8.5f);
//     System.out.println(a1);
//     a1.bark();
     
     Animal dog1 = new Dog("BoBo",5.5f);
     System.out.println(dog1);
     dog1.bark();//汪汪
     
     Animal cat1 = new Cat("Kitty",2.5f);
     System.out.println(cat1);
     cat1.bark();
    }
    
}

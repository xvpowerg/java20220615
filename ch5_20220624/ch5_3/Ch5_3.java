/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20220624.ch5_3;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student();
        st1.name = "Ken";
        st1.age = 10;
        st1.print();
        //每個物件都獨立互不影響
        Student st2  = new Student();
        st2.name = "Vivin";
        st2.age = 16;
        st2.print();
//        System.out.println(st2.name+":"+st2.age);
//        System.out.println(st1.name+":"+st1.age);
    }
    
}

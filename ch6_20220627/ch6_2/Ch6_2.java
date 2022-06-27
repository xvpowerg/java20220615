/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220627.ch6_2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {
    public static void main(String[] args) {
       Test1 t1 = new Test1("Test1 Msg");
       Test2 t2 = new Test2("Test2 Msg2");    
       t1.setMsg("Test1X Msg");
       t2.setMsg("Test2 Msg");
        t1.print();
        t2.print();
    }
    
}

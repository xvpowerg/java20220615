/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220627.ch6_3;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    public static void main(String[] args) {
       int type = 1;
       Fruit f1 =  null;
       switch(type){
           case 1:
               f1 = new Apple(50);
               break;
           case 2:
               f1 = new Charry(20);
               break;
       }
        
       f1.print();
        
        
    }
    
}

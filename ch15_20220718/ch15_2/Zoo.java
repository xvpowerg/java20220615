/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20220718.ch15_2;

/**
 *
 * @author xvpow
 */
public class Zoo {
   enum Animal{
        DOG,
        CAT,
        MONKEY
    }
    
    public void append(Animal animal){
       switch(animal){
           case DOG:
               System.out.println("汪汪");
               break;
           case CAT:
               System.out.println("喵喵");
               break;
           case MONKEY:
               System.out.println("吃香蕉");
               break;
           default:
               System.out.println("Error!");
               break;
       }
    }
    
    public void food(int food){
        switch(food){
            case Food.FISH:
                System.out.println("Fish");
                break;
            case Food.PORK:
                System.out.println("Pork");
                break;
            case Food.CHICKEN:
                System.out.println("Chicken");
                break;
                    
        }
    }
}

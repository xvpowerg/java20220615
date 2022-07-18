/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20220718.ch15_2;
import ch15_20220718.ch15_2.Zoo.Animal;
/**
 *
 * @author xvpow
 */
public class Ch15_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();        
        zoo1.append(Animal.DOG);
        zoo1.append(Animal.MONKEY);
        zoo1.append(Animal.CAT);
        zoo1.food(12312);
    }
    
}

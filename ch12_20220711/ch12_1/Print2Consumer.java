/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220711.ch12_1;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Print2Consumer  implements Consumer<String> {
    private int count = 0;
    private int maxCount =0;
    Print2Consumer(){
        this(2);
    }
    Print2Consumer(int maxCount){
        this.maxCount = maxCount;
    }
    public void accept(String st){        
        System.out.print(st+" ");
           ++count;
        if (count%maxCount == 0){
            System.out.println();    
        }
    }
}

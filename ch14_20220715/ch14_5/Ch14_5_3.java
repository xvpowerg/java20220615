/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_5;
import java.util.function.Supplier;
public class Ch14_5_3 {

    
    static void showMsg(Supplier<String> msgSupp){
        System.out.println(msgSupp.get());
    }
    public static void main(String[] args) {
        TestMethodRef tmr = new TestMethodRef("Error");
        showMsg(tmr::getMsg);
    }
    
}

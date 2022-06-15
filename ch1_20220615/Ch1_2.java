/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220615;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //控制命令只有一條時 可不加{}
        var age = 21;
        if (age > 18)
            System.out.println("adult");
        else
            System.out.println("underage");
            System.out.println("End!!");//不在else控制範圍內  
    }
    
}

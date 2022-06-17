/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            tag:
            for (int i = 1; i <= 2; i++){
                System.out.println("Start===");
                 for (int k = 1; k<=3; k++){
                     System.out.println(k);
                    if (k==2){
                        break tag;
                    }   
                 }
                System.out.println("End===");
                }
        }
}
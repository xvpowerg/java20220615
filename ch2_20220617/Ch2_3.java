/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_3 {


    public static void main(String[] args) {
            
        for (int i = 1; i <= 2; i++){
            for (int k = 1; k<=3; k++){
                System.out.println(i+":"+k);
                if (i == 2){
                    break;
                    //continue;
                }
                //System.out.println(i+":"+k);
            }
        }
        
        System.out.println("================================");
       for (int i = 1; i <= 2; i++){
            for (int k = 1; k<=3; k++){
                if (i == 2){
                    //break;
                    continue;
                }
                System.out.println(i+":"+k);
            }
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220615;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var action = 2;
        switch(action){
            case 1:
                System.out.println("Play");
                break;
            case 2:
                 System.out.println("Stop");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Error!");
                break;
        }
        
    }
    
}

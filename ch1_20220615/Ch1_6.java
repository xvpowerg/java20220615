/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20220615;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    public static void main(String[] args) {
        final var PLAY = 1;
        final var STOP = 2;
        final var EXIT = 3;
        int action = EXIT;
        
        switch(action){
            case PLAY:
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;  
            case EXIT:
                System.out.println("Exit");
                break;  
        }
        
        
        
    }
    
}

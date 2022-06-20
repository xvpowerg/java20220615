/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220620;

/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = new String[3];
       switch(names[1]){
           case " ":
               System.out.println("E1");
               break;
            case "":
                 System.out.println("E2");
               break;
            default:
                System.out.println("E3");
                break;
       }
    }
    
}

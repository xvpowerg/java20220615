/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20220729;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\mymsg.txt");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
    
}

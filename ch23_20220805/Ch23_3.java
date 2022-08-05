/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *
 * @author xvpow
 */
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Path p1 = Paths.get("C:","mydir","dir","dir1");
        Path p2 = Paths.get("C:","mydir");
        Path p3 =  p1.relativize(p2);
        System.out.println(p3);
        
        Path p4 = Paths.get("C:","mydir");
        Path p5 = Paths.get("D:","mydir");
        p4.relativize(p5);
        
    }
    
}

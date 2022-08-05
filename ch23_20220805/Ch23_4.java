/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20220805;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path p1 = Paths.get("/home",".","mydir","test");
        System.out.println(p1);
        Path p2 = p1.normalize();
        System.out.println(p2);
        
        Path p3 = Paths.get("/home","music","..","images","photo.jpg");
       System.out.println(p3);
        Path p4 = p3.normalize();
        System.out.println(p4);
    }
    
}

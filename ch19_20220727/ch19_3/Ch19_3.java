/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220727.ch19_3;
import java.util.stream.IntStream;
import java.util.OptionalDouble;
/**
 *
 * @author xvpow
 */
public class Ch19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IntStream intStream = IntStream.of(7,8,1,5,4,2);
        OptionalDouble opd = intStream.average();        
        System.out.println(opd.getAsDouble());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m7;
import tw.com.m5.TestM5;
import tw.com.m4.TestM4;
import tw.com.m6.TestM6;

/**
 *
 * @author xvpow
 */
public class TestM7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestM4 m4 = new TestM4();
        TestM5 m5 = new TestM5();
        TestM6.showM4(m4);
        TestM6.showM5(m5);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220706.Ch10_5;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        Jump jp1 = p1;
        Run run1 = p1;
        jp1.jumping();
        run1.runing();
        
    }
    
}

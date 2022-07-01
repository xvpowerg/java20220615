/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220701.ch8_3;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Student st = new Student("Ken",25);
            st.print();
        }catch(IllegalArgumentException ex){
               System.out.println(ex);
        }
        
    }
    
}

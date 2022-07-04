/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20220704.ch9_1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal a1 = new Animal();
      
      try{
            a1.setName("Momo");
            a1.setName(null);
            //a1.setHeight(12.5f);
            a1.setHeight(-12.5f);
            a1.setAge(10);
            a1.print();    
      }catch(HeightException | NameException  ex){//不可父子關西
          System.out.println(ex);
      }
      
    }
    
}

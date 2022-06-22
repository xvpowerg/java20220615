/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220622;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boolean b1 = true;
        System.out.println(b1);
      //只要不是連續的true這四個字母 一律回傳false  
      boolean b2 =   Boolean.parseBoolean("true");
      System.out.println(b2);
      b2 =   Boolean.parseBoolean("TrUe");
      System.out.println(b2);
      b2 = Boolean.parseBoolean("T R U E");
      System.out.println(b2);
    }
    
}

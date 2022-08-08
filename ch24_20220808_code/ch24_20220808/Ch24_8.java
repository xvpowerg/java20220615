/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220808;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author xvpow
 */
public class Ch24_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale local = new Locale("en","US");
      ResourceBundle res =  ResourceBundle.getBundle("mytest",local);
      System.out.println(res.getString("tw.test.v1"));
       System.out.println(res.getString("tw.test.v2"));//會找en
    }
    
}

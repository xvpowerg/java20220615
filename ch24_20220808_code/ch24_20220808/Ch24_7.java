/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20220808;
import java.util.ResourceBundle;
import java.util.Locale;
/**
 *
 * @author xvpow
 */
public class Ch24_7 {

    public static void main(String[] args) {
      ResourceBundle res =  ResourceBundle.getBundle("messages");
      System.out.println(res.getString("tw.ken.welcome"));
       System.out.println(res.getString("tw.ken.name"));  
       System.out.println(res.getString("tw.ken.color"));  
       System.out.println("============================");
       Locale local = new Locale("en","US");
     ResourceBundle res2 =  ResourceBundle.getBundle("messages",local);
      System.out.println(res2.getString("tw.ken.welcome"));
       System.out.println(res2.getString("tw.ken.name"));  
       System.out.println(res2.getString("tw.ken.color"));  
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {
    public static void main(String[] args) {
          String url = "jdbc:derby://localhost:1527/mydb20220812";
     String user = "qwer";
     String password = "123456";
        try(Connection con =  DriverManager.getConnection(url,user,password);
            PreparedStatement stm = 
                 con.prepareStatement("INSERT INTO "
                         + "student(id,st_name,st_age,std_score)VALUES(?,?,?,?)");){
            //con.setAutoCommit(false);
            stm.setInt(1, 200);
            stm.setString(2, "NoNo");
            stm.setInt(3, 25);
            stm.setFloat(4, 86);
           //con.commit();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}

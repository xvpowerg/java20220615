/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220812;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author xvpow
 */
public class Ch26_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             String url = "jdbc:derby://localhost:1527/mydb20220812";
     String user = "qwer";
     String password = "123456";
        try(Connection con =  DriverManager.getConnection(url,user,password);
            Statement stm =     con.createStatement();){
            
            ResultSet set = stm.executeQuery("SELECT * FROM student");
            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString("st_name");
                int age = set.getInt(3);
                double score = set.getDouble("std_score");
                System.out.println(id+":"+name+":"+age+":"+score);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}

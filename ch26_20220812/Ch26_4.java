/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20220812;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String url = "jdbc:derby://localhost:1527/mydb20220812";
     String user = "qwer";
     String password = "123456";
        try( Connection conn = DriverManager.getConnection(url, user, password);
             Statement stm = conn.createStatement();){
            int count = stm.executeUpdate("INSERT INTO student(id,st_name,st_age,std_score)VALUES(200,'Ben',25,92.5)");
            System.out.println(count);
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        
    }
    
}

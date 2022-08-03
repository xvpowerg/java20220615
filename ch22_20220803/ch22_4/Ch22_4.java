/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product("Ken",18);
        File file = new File("C:\\mydir\\product.obj");
        try(FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream objStr = new   ObjectOutputStream(fout);  ){
            objStr.writeObject(p1);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    
}

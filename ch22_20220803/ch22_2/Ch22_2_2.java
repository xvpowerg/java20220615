/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch22_2_2 {

    public static void main(String[] args) {
       //對groupMap 做反序列化
               File file = new File("C:\\mydir\\dataMap.obj");
               try(FileInputStream fin = new FileInputStream(file);
                   ObjectInputStream objIn = new  ObjectInputStream(fin);){
                   
                   HashMap<Integer,ArrayList<Integer>>  dataHassMap =
                           ( HashMap<Integer,ArrayList<Integer>>)objIn.readObject();
                   System.out.println(dataHassMap);
               }catch(IOException | ClassNotFoundException ex){
                   System.out.println(ex);
               }
               
    }
    
}

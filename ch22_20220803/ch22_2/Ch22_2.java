/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20220803.ch22_2;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {
    static void mapToSerialz(HashMap<Integer,ArrayList<Integer>> map){
        File file = new File("C:\\mydir\\dataMap.obj");
        try(FileOutputStream fOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fOut)){
            objOut.writeObject(map);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> dataList = new ArrayList();
        HashMap<Integer,ArrayList<Integer>> groupMap = new HashMap();
        //dataList  30筆數值  10~100之間的亂數
        Random ran = new Random();
         for(int i = 1; i<= 30;i++){
               int n = ran.nextInt(91)+10;
               dataList.add(n);
         }
         
         for(int data : dataList){
             int key = 0;
              if (data >= 60){
                  if (data == 100){
                      key = 9;
                  }else{
                      key = data/10;
                  }
                  
              }
              ArrayList<Integer> tmpList = new ArrayList();
              tmpList.add(data);
             groupMap.merge(key, tmpList, (oList,nList)->{
                oList.addAll(nList);
                return oList;
             });
         }
         System.out.println(groupMap);
      //使用HashMap 分組  9x 以上包含90的一組  8x 7x 6x  其他的一組  其他的編號為0  
      //幫我序列化這組 HashMap
      mapToSerialz(groupMap);
        //{0=[57, 39, 28, 36, 21, 54, 39, 42, 26, 59, 29, 40, 44, 13, 20, 52, 22, 24, 28, 16, 12], 6=[61, 63], 7=[74, 79], 8=[85, 88, 86], 9=[96, 91]}
    }
    
}

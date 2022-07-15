/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_4;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestIF4 tif4_1 = (int v1,float f1)->{
          return "數據:"+v1+":"+f1;
      };
    System.out.println(tif4_1.test(10, 2.56f));
    
    TestIF4 tif4_2 = (v1,f1)->{
        return "資料:"+v1+":"+f1;
    };
    System.out.println(tif4_2.test(10, 15.6f));
      //1個以上的參數不可移除()
     //TestIF4 tif4_3 = v1,f1->{return ""};
     TestIF4 tif4_3 = (v1,f1)->"兩筆資料:"+v1+":"+f1;
     System.out.println(tif4_3.test(36,17.25f));
     
    }
    
}

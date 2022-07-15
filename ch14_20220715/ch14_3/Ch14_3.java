/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_3;

/**
 *
 * @author xvpow
 */
public class Ch14_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestIF3 tif3 = (int v)->{       
            return "數據:"+v;
       };
       System.out.println(tif3.test(25));
       
       TestIF3 tif3_2=v->{return "資料:"+v;};
       System.out.println(tif3_2.test(10));
       
       //TestIF3 tif3_3 = v-> return "";  //錯誤不須加上return
       TestIF3 tif3_3 = v->"數字:"+v;
       System.out.println(tif3_3.test(30));
    }
    
}

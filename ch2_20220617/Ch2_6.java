/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 10 , b = 10;
        //==數值是否相等
        //基本型態 數值相等就是相等
        System.out.println(a == b);
        
        String name1 = "Ken";
        String name2 = "Ken";
        System.out.println(name1+":"+name2);
        System.out.println(name1 == name2);
        System.out.println("======================");
        String name3 = "Vivin";
        String name4 = String.valueOf("Vivin");
        System.out.println(name3 == name4);
        System.out.println("======================");
        String name5 = new String("Lucy");//產生新的記憶體位置
        String name6 = new String("Lucy");//產生新的記憶體位置
        System.out.println(name5+":"+name6);
        System.out.println(name5 == name6);//數值不相等
        //比內容 equals
        System.out.println(name5.equals(name6));
        
        //字串池
//        String v="";
//        for(int i =1; i<=10;i++){
//            v+=i;
//        }
//        System.out.println(v);
         String name7 = null;
         System.out.println(name7.equals(name6));
    }
    
}

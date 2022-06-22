/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220622;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

    //方法標準式
    //回傳值  方法名稱  傳入的參數   方法本體
     static  void test1(){
          System.out.println("Test1");
      } 
     static int test2(int v1,int v2){
         System.out.println(v1+":"+v2);
         return v1 + v2;//中斷函示味道
     }
     
     static int sum(int ... numbers){
         int ans = 0;
         for (int v : numbers){
             ans += v;
         }
         return ans;
     }
     //長參數 有限制必須是函數的最後一位
     static int testArgs(int v2,int ... vs){
           int sum = 0;
           for (int v : vs){
               sum += (v * v2);
           }
         return sum;
     }
     
      //靜態無法呼叫非靜態
    public static void main(String[] args) {
        // TODO code application logic here
        test1();
        System.out.println(test2(2,5));
        System.out.println(sum(1,2,5,7));
        System.out.println(sum());
        System.out.println(testArgs(2,9,1,3));
    }
    
}

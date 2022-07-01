/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220701.ch8_1;

public class Ch8_1 {

    //override 規則
    /*
      //比較對象都是父類別
      1 讀取權限只能開放 不能封閉
      2 回傳如是基本型態必須一樣 
      3 回傳如參考型態可以一樣或子類
      4 方法名稱與參數類型必須一樣
      5 例外拋出可以拋一樣可以子類可以拋出
    */
    public static void main(String[] args) {
          Test1 t1 = new Test2(); 
          t1.publicMethod();
          t1.protectedMethod();
          t1.defaultMethod();
        
    }
    
}

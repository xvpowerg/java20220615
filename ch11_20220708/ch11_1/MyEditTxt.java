/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20220708.ch11_1;

/**
 *
 * @author xvpow
 */
public class MyEditTxt  implements MyPrint{
    private String txt;
    public void setTxt(String txt){
        this.txt = txt;
    }
   public String print(){
       return this.txt;
   }
}

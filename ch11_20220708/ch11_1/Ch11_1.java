/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220708.ch11_1;

/**
 *
 * @author xvpow
 */
public class Ch11_1 {

    
    static void showValue(MyPrint print){
        print.showMsg();
    }
    public static void main(String[] args) {
      MyCheckBox cbox = new MyCheckBox();
        cbox.append("A");
        cbox.append("C");
        cbox.append("G");
     showValue(cbox);   
     MyEditTxt eTxt = new MyEditTxt();
     eTxt.setTxt("MyTxt Msg");
       eTxt.showMsg();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private int valeu1;
    private String valeu2;
    Test1(int valeu1,String valeu2){
        this.valeu1 = valeu1;
        this.valeu2 = valeu2;
    }
    
    public boolean equals(Object obj){
       if ( obj == null ||
             !(obj instanceof Test1) ){
            return false;
        }
//        if ( obj == null ||
//                obj.getClass().getName() != this.getClass().getName()){
//            return false;
//        }
        Test1 t1 = (Test1)obj;
        //左邊基本型態
        return this.valeu1 == t1.valeu1 && this.valeu2.equals(t1.valeu2);
    }
    
    public String toString(){
        return this.valeu2+":"+this.valeu1;
    }
    
}

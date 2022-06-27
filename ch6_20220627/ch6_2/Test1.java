/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220627.ch6_2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(String msg){
        this.msg = msg;
    }
    private String msg;
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }
    public void print(){
        System.out.println(msg);
    }
}

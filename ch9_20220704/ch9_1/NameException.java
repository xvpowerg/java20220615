/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_1;

/**
 *
 * @author xvpow
 */
public class NameException extends RuntimeException{
    public NameException(){
        
    }
    public NameException(String msg){
        super(msg);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20220708.ch11_1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyCheckBox  implements MyPrint{
    private ArrayList<String> checkData = new ArrayList();
    
    public void append(String data){
        checkData.add(data);
    }
    
    public String print(){        
        StringBuilder sb = new StringBuilder();
        for(String v : checkData){
            sb.append(v);
        }
        return sb.toString();
    }
    
}

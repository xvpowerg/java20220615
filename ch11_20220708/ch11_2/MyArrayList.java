/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20220708.ch11_2;
import java.util.Iterator;
/**
 *
 * @author xvpow
 */
public class MyArrayList implements Iterable<String>{
    private String[] datas = new String[1000000];
    private int size = 0;
    public void add(String data){
        datas[size++] = data;
    }
    
    public String get(int index){
          return datas[index];
    }
    
    public int size(){
        return size;
    }
    
    public Iterator iterator(){
        return new MyIterator(this);
    }
}

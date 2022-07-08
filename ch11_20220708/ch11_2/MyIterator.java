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
public class MyIterator implements Iterator<String> {
    private MyArrayList list;
    private int index = -1;
    MyIterator(MyArrayList list){
        this.list = list;
    }
        public boolean hasNext(){
             if ( index < list.size() -1 ) 
                 return true;
            return false;
//            return  index < list.size() -1  ? true: false;
        }
        public String next(){                        
            return list.get(++index);
        }
        
}

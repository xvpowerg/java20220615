/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20220622.ch17_6;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> data = new ArrayList<>();
    public void add(T value){
        data.add(value);
    }
    public T get(int i){
        return data.get(i);
    }
    public void foreach(Consumer<T>c){
        data.forEach(c);
    }
}

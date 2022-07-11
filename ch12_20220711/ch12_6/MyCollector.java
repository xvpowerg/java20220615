/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220711.ch12_6;
import java.util.List;
import java.util.function.Supplier;

public class MyCollector {
    public List<String>  toList(Supplier<List<String>> supList,String ... names){
        List<String> list = supList.get();
        for (String v : names){
            list.add(v);
        }
        return list;
    }
}

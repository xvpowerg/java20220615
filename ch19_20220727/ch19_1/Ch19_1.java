/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220727.ch19_1;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Ch19_1 {
static class Item{
    private static Random ran = new Random();
    private String  name;
    private ArrayList<String> list = new ArrayList();
    
    public Item(String name){
        int n = ran.nextInt(25)+1;
        for(char i =0;i<= n;i++){
            char c1 = (char)('A'+i);
            String value = c1+"";
            list.add(value);
        }
        this.name = name;
    }
    public String toString(){
        return "Item:"+name;
    }
    
    public Stream<String> getSream(){
        return list.stream();
    }
}
    public static void main(String[] args) {
          ArrayList<String> list = new ArrayList();  
          list.add("Ken");
          list.add("Vivin");
          list.add("Lucy");
          list.add("Iris");
          list.add("Joy");
          long count = list.stream().map(Item::new).
                  flatMap(it->it.getSream()).count();
          System.out.println(count);
          
//          Item it1 = new Item("Test1");
//          System.out.println(it1);
//          Optional<String> op1 = list.parallelStream().findAny();
//          Optional<String> op2 = list.stream().findFirst();
//          System.out.println(op1.get());
//          System.out.println(op2.get());
    //list.stream().map(n->new Item(n)).forEach(it->System.out.println(it));
    //list.stream().map(Item::new).forEach(it->System.out.println(it));
//    int sum = list.stream().mapToInt(st->st.length()).sum();
//    System.out.println(sum);

//    Item it1 = new Item("Ken");
    //it1.getSream().forEach(v->System.out.print(v));
    
    }
    
}

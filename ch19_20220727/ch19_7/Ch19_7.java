/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20220727.ch19_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch19_7 {
      static class Student{
          private String name;
          private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" + "name=" + name + ", score=" + score + '}';
        }
      }
    public static void main(String[] args) {
           ArrayList<Student> list = new ArrayList();  
          Student st1 = new Student("Ken",85);
          Student st2 = new Student("Vivin",53);
          Student st3 = new Student("Lucy",94);
          Student st4 = new Student("Iris",52);
          Student st5 = new Student("Ben",95);
          Student st6 = new Student("Joy",38);
           list.add(st1);
          list.add(st2);
          list.add(st3);
          list.add(st4);
          list.add(st5);
          list.add(st6);
        Map<Boolean,List<Student>> pGroup =   
                list.stream().collect(Collectors.partitioningBy(st->st.score >= 60));
        System.out.println(pGroup);
          
        String names = 
                list.stream().map(st->st.name).collect(Collectors.joining(",", "Names:", "."));
        System.out.println(names);
    }
    
}

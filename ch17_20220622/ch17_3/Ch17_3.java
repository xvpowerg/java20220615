/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20220622.ch17_3;
import java.util.HashMap;
import java.util.ArrayList;
public class Ch17_3 {

    private static class Student{
         private String name;
         private int score;
        Student(String name,int score){
            this.name = name;
            this.score = score;                    
        } 
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap <String,Integer> totalMap = new  HashMap();
       Student st1 = new Student("Ken",72);
       Student st2 = new Student("Vivin",83);
       Student st3 = new Student("Ken",65);
       Student st4 = new Student("Lucy",91);
       Student st5 = new Student("Vivin",42);
       Student st6 = new Student("Lucy",75);
       Student st7 = new Student("Vivin",63);
       //相同學生的成績加總放到
       ArrayList<Student> list = new ArrayList();
       list.add(st1);
       list.add(st2);
       list.add(st3);
       list.add(st4);
       list.add(st5);
       list.add(st6);
       list.add(st7);
        for (Student st : list){
            totalMap.computeIfPresent(st.name, (k,v)->st.score + v);
            totalMap.computeIfAbsent(st.name, k->st.score);
        }
        System.out.println(totalMap);
//merge       
//         for (Student st : list){
//             totalMap.merge(st.name, 
//                     st.score, (s1,s2)->s1+s2);
//         }
//         System.out.println(totalMap);


//       for (Student st : list){
//           int score = 0;
//           if (totalMap.containsKey(st.name)){
//               score = totalMap.get(st.name);               
//           }
//           score += st.score;
//           totalMap.put(st.name, score);
//       }
//       System.out.println(totalMap);
       
       
    }
    
}

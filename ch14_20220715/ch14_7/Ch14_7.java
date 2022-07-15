/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20220715.ch14_7;
import java.util.function.Function;
public class Ch14_7 {
    public static void main(String[] args) {
      Student st1 = new Student("Ken");
      System.out.println(st1);
      Function<String,Student> nameToStudent = name->{
            return new Student(name);
      };
      System.out.println(nameToStudent.apply("Vivin"));
      
      Function<String,Student> nameToSt2 = Student::new;
      System.out.println(nameToSt2.apply("Lindy"));
      
    }
    
}

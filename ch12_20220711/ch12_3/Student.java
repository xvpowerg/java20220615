/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20220711.ch12_3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Student {
     private ArrayList<Integer> gradesList = new ArrayList();
     public void appendGrades(int score){
         gradesList.add(score);
     }
     public class Grades{
         //不希望Grades 在外部new 所以設定為private
         private Grades(){
         }
        void foreach(){
            for (int v : gradesList){
                System.out.println(v);
            }
        } 
        
        int sum(){
            int sum = 0;
            for (int g : Student.this.gradesList){
                sum += g;
            }
            return sum;
        }
        float avg(){
            float result = 
                    sum()/(gradesList.size()+0.0f);
            return result;
        }
     }
     
     public Grades getGrades(){
         return new Grades();
     }
}

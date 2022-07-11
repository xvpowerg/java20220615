/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220711.ch12_3;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student();
        st.appendGrades(75);
        st.appendGrades(88);
        st.appendGrades(95);
        st.appendGrades(72);
        
      Student.Grades grades =   st.getGrades();
      grades.foreach();
     System.out.println(grades.sum()); 
     System.out.println(grades.avg()); 
      
    }
    
}


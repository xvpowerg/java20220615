/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20220704.ch9_5;

/**
 *
 * @author xvpow
 */
public class Student extends Person {
    private int score;    
    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }
    
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Student)){
            return false;
        }
        Student st = (Student)obj;
        return st.score == this.score && super.equals(obj);
    }
    
    public String toString(){
        return super.toString()+":"+this.score;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20220720.ch16_5;

/**
 *
 * @author xvpow
 */
public class Student {
  static int stCmp(Student st1,Student st2){
        if (st1.score1 > st2.score1){
            return 1;
        }else if(st1.score1 < st2.score1){
            return -1;
        }else if (st1.score2 > st2.score2){
            return 1;
        }else if(st1.score2 < st2.score2){
          return -1;  
        }else if(st1.score3 > st2.score3){
            return 1;
        }else if(st1.score3 < st2.score3){
            return -1;
        }
      
    return st1.name.compareTo(st2.name);
}
    
    private String name;
    private int score1;
    private int score2;
    private int score3;
    public Student(String name,int score1,int score2,int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public String getName(){
        return name;
    }
    public int getScore1(){
        return score1;
    }
    public int getScore2(){
        return score2;
    }
    
    public int getScore3(){
        return score3;
    }
    
    public String toString(){
        return this.name+":"+
                this.score1+":"+
                this.score2+":"+this.score3;
    }
}

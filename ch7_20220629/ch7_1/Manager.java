/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220629.ch7_1;

/**
 *
 * @author xvpow
 */
public class Manager extends Employee {
    private int bonus ;
      Manager(String name,int age,int salary,int bonus){
          this(name,age,salary);
          this.bonus = bonus;
      }
      public int getBonus(){
          return bonus;
      }
      
      public int getOriginalSalary(){
          return super.getSalary();
      }
      
     public int getSalary(){
         return getOriginalSalary() + this.getBonus();                 
     }
      
      Manager(String name,int age,int salary){
            super(name,age,salary);
      }
}

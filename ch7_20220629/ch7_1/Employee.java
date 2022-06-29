/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20220629.ch7_1;
public class Employee {
    private String name;
    private int age;
    private int salary;
 Employee(String name,int age,int salary){
     this.name = name;
     this.age = age;
     this.salary = salary;
 }
 public String getName(){
     return this.name;
 }
 public void setName(String name){
     this.name = name;
 }
 
 public int getAge(){
     return age;
 }
 
 public void setAge(int age){
     this.age = age;
 }
 
 public int getSalary(){
     return this.salary;
 }
    
 public void setSalary(int salary){
     this.salary = salary;
 }
 
 public void print(){
     System.out.println(this.name+":"+this.age+":"+this.getSalary());
 }
}

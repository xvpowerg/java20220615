/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220629.ch7_1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {
        
    
    public static void printManagerOrRd(Employee... emps){
        for (Employee emp : emps){
            emp.print();
        }
    }
    
    public static void main(String[] args) {
       Manager man1 = new Manager("Ken",32,50000,3000);
       System.out.println(man1.getBonus());
       System.out.println(man1.getOriginalSalary());
       
       RD rd = new RD("Lucy",25,45000);
       printManagerOrRd(man1,rd);
    }
    
}

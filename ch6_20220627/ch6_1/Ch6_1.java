/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220627.ch6_1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Ken",12,165);        
        p1.print();
        p1.setName("Lucy");
        p1.print();
        
        Student st1 = new Student();
        st1.setAge(5);
        st1.setName("Join");
        st1.setHeight(100);
        st1.print();
        
        Student st2 = new Student("Iris",8,110);
        st2.print();
        
        Teacher t1 = new Teacher("Vivin",22,162);
        t1.print();
        
    }
    
}

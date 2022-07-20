/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20220720.ch16_5;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {

    public static void main(String[] args) {
        Student st1 = new Student("Ken",92,85,72);
        Student st2 = new Student("Vivin",85,77,63);
        Student st3 = new Student("Lindy",92,62,91);
        Student st4 = new Student("Lucy",92,85,83);
        Student st5 = new Student("Iris",92,85,72);
        
        //TreeSet<Student> set = new TreeSet<>(Student::stCmp);
        Comparator<Student> cmp = 
                Comparator.comparing(cp->cp.getScore1());
        cmp = cmp.thenComparing(cp->cp.getScore2()).
                thenComparing(cp->cp.getScore3()).
                thenComparing(cp->cp.getName());
        cmp = cmp.reversed();
        TreeSet<Student> set = new TreeSet<>(cmp);
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);
       System.out.println(set);
    }
    
}

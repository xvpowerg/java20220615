/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20220622;

/**
 *
 * @author xvpow
 */
public class Ch4_5 {

    static void test1(){
        int v1 = 10;                
    }
    
    static void loop(int x){
        System.out.println("Start:"+x);
        if (x <=3){
        System.out.print(x+" ");
            loop(x+1);
        }
      System.out.println("End:"+x);        
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        int x = 20;
//        int y = 15;
//        test1();
//        System.out.println(x+":"+y);
loop(1);
  System.out.println();
    }
    //Stack
}

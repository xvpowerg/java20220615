/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220617;

/**
 *
 * @author xvpow
 */
public class Ch2_2 {
    static int testM1(){
        System.out.println("testM1");
        return 1;//回傳的數值
    }
    static boolean testM2(){
            System.out.println("testM2");
        return true;
    } 
    static void testM3(){
        System.out.println("TestM3");      
    }
    static void testM4()
      {
          System.out.println("TestM4");               
      }

    public static void main(String[] args) {
        // TODO code application logic here
      // System.out.println(testM1());
      //1 2 3
      //4 2 3
       int x = 0;
       for (int i = testM1();i<=3 && x++ < 5&& testM2();i++,testM3()){
           testM4();
       }
       System.out.println(x);
    }
    
}

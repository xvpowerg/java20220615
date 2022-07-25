/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_6;

/**
 *
 * @author xvpow
 */
public class Ch18_6 {

    static void testName(String name){
            if (name.length() > 2){
             System.out.println("正確");
         }else{
              System.out.println("錯誤");
         }
    }
    public static void main(String[] args) {
     Student st1 = new Student();
     st1.setName("Ken");
//     if (st1.getName() == null){
//         System.out.println("name是null");
//     }else if (st1.getName().length() > 2){
//         System.out.println("正確");
//     }else{
//          System.out.println("錯誤");
//     }

    
st1.getNameOption().ifPresentOrElse((v)->{
testName(v);
}, ()->System.out.println("錯誤"));

     

    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20220725.ch18_7;
import java.util.Optional;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch18_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String value = null;
        //Optional<String> op1 = Optional.of(value);//不支持null
        Optional<String> op2 = Optional.ofNullable(value);//支持null
        //op2.get();// 如果內容是null會拋出.NoSuchElementException
        if (op2.isPresent())
            System.out.println(op2.get());
        
        op2.ifPresent(v->System.out.println("ifPresent:"+v));
        String msg = op2.orElse("name是 null");
        String msg2 =op2.orElseGet(()->{
            Random ran = new Random();
            return "name is null:"+ran.nextInt(10000);});
        System.out.println(msg);
       System.out.println(msg2);
       
        String name = op2.orElseThrow(()->new RuntimeException("Name 資訊錯誤!"));
        
    }
    
}

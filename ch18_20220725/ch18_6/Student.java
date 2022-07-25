/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20220725.ch18_6;
import java.util.Optional;
public class Student {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
       public Optional<String>  getNameOption(){           
        return Optional.ofNullable(name);
    }
    
}

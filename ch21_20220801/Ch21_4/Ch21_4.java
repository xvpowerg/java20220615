/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20220801.Ch21_4;

/**
 *
 * @author xvpow
 */
public class Ch21_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
       try( MyClose myc1 = new MyClose("C1",false);
            MyClose myc2 = new MyClose("C2",false);){
           System.out.println("Body.....");
       }catch(Exception ex){
           System.out.println(ex);
       }
        System.out.println("=====================");
        
        try(MyClose myc1 = new MyClose("C1",false);
            MyClose myc2 = new MyClose("C2",true); ){            
            System.out.println("Body.....");
        }catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("=====================");
        
        try(MyClose myc1 = new MyClose("C1",true);
           MyClose myc2 = new MyClose("C2",true);){
            System.out.println("Body.....");
        }catch(Exception ex){
          Throwable[] ths =   ex.getSuppressed();
            for (Throwable th : ths){
            System.out.println(th);
            }
            System.out.println(ex);
        }
          System.out.println("=====================");
        
          try(MyClose myc1 = new MyClose("C1",true);
              MyClose myc2 = new MyClose("C2",true)){
                  
              throw new Exception("Body Exception!");
            }catch(Exception ex){
                Throwable[] ths =   ex.getSuppressed();
                   System.out.println(ex);
                for (Throwable th : ths){
                      System.out.println(th);
                }
             
            }
        
    }
    
}

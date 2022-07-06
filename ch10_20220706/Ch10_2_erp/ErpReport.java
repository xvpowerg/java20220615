/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220706.Ch10_2_erp;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public  abstract class ErpReport {
   private List<String> readData(){
       List<String> datas = new ArrayList();
       datas.add("Ken");
       datas.add("Vivin");
       datas.add("Lucy");
       datas.add("Joy");
       datas.add("Iris");
       return datas;
   } 
    
    public final void showErpReport(){
       List<String> data =   readData();
       exportReport(data);
    }
   protected abstract void exportReport(List<String> data);
}

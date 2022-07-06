/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20220706.Ch10_3_report;
import ch10_20220706.Ch10_2_erp.ErpReport;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class MyReport  extends ErpReport{
    protected void exportReport(List<String> data){
        for (String v : data){
            System.out.print(v+" ");
        }
        System.out.println();
    }
}

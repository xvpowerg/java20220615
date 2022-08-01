/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20220801.ch21_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileRead extends InputStreamReader {
     public MyFileRead(File file)throws FileNotFoundException,UnsupportedEncodingException{
         this(file,"UTF-8");
     }
    public MyFileRead(File file,String charsetName) throws FileNotFoundException,UnsupportedEncodingException{
        super(new FileInputStream(file),charsetName);
    }
}

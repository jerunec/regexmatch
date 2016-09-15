/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author jpcunanan
 */
public class JavaApplication1 {

public static boolean isTrue(String str){
    return str.matches("true");
    
}
public static boolean containsFalse(String str){
    return str.matches(".*false.*");
    
}
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(isTrue("false"));
        System.out.println(containsFalse("dsadasdasdsad"));
      Scanner sc = new Scanner(new FileReader("input.txt"));

while(sc.hasNext())
{
    System.out.println(isTrue(sc.nextLine()));
    
}
    }
    
}

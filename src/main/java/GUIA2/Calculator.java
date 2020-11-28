/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA2;

/**
 *
 * @author CarlosJr
 */
public abstract class Calculator {
    
    public static int sum(int n1, int n2) {
        int result = n1 + n2;
        
        return result;
    }
    
    public static int substraction(int n1, int n2){
        int result = n1 - n2;
        
        return result;
    }
    
    public static int multiplication(int n1, int n2){
        int result = n1 * n2;
        
        return result;
    }
    
    public static int division(int n1, int n2){
        int result = n1 / n2;
        
        return result;
    }
    
}

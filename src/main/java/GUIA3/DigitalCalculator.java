/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;

/**
 *
 * @author CarlosJr
 */
public class DigitalCalculator{
    
    private int n1;
    private int n2;

    public DigitalCalculator() {
    }

    public DigitalCalculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public DigitalCalculator(DigitalCalculator calcu) {
        this.n1 = calcu.n1;
        this.n2 = calcu.n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
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

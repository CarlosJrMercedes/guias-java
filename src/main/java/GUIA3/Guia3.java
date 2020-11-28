/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;
import java.util.Scanner;

/**
 *
 * @author CarlosJr
 */
public class Guia3 {
    public static void main(String[] args) {
        DigitalCalculator cal = new DigitalCalculator();
            
        Scanner esc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número :");
        int n1 = esc.nextInt();
        
        System.out.println("Ingrese el segundo número :");
        int n2 = esc.nextInt();
        
        cal.setN1(n1);
        cal.setN2(n2);
        
        System.out.println("El resultado de la suma es : " + 
                cal.sum(cal.getN1(), cal.getN2()));
        System.out.println("\n");
        System.out.println("El resultado de la resta es : " + 
                cal.substraction(cal.getN1(), cal.getN2()));
        System.out.println("\n");
        System.out.println("El resultado de la multiplicación es : " + 
                cal.multiplication(cal.getN1(), cal.getN2()));
        System.out.println("\n");
        System.out.println("El resultado de la división es : " + 
                cal.division(cal.getN1(), cal.getN2()));
        System.out.println("\n");
        
    }
    
    
    
}

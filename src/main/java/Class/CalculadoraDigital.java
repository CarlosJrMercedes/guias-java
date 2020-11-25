/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.util.Scanner;
/**
 *
 * @author CarlosJr
 */
public class CalculadoraDigital implements Calculator{
    
    private int n1;
    private int n2;
    
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

    public CalculadoraDigital() {
    }

    public CalculadoraDigital(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public CalculadoraDigital(CalculadoraDigital calcu) {
        
        this.n1 = calcu.n1;
        this.n2 = calcu.n2;
        
    }
    
    

    @Override
    public int sum(int n1, int n2) {
        int result = n1 + n2;
        
        return result;
    }

    @Override
    public int substraction(int n1, int n2) {
        int result = n1 - n2;
        
        return result;
    }

    @Override
    public int multiplication(int n1, int n2) {
        int result = n1 * n2;
        
        return result;
    }

    @Override
    public int division(int n1, int n2) {
        int result = n1 / n2;
        
        return result;
    }

    public static void main(String[] args) {
        CalculadoraDigital cal = new CalculadoraDigital();
        Scanner esc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número : ");
        int n1 = esc.nextInt();
        
        System.out.println("Ingrese el segundo número : ");
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

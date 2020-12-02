/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIMOSHELDON;

/**
 *
 * @author CarlosJr
 */
public class Primo {
    
    private static int invertirNumero(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }
    
    
    private static int primoPosition(int pos){
        int primoposision = 0;
        int primoIteracion= 1;
        for (int i = 2; i <= 10000; i++) {
            
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i %j == 0) {
                    cont++;
                }
            }
            if (cont != 2) {
                
            }else{
                
                if (primoIteracion == pos) {
                    primoposision = i;
                }
                primoIteracion++;
            }
        }
        return primoposision;
    }
    
    public static void main(String[] args) {
        int iteracion = 1;
        int inverso= 0;
        int posision = 0;
        int primoposision = 0;
        int reverPrimoPos = 0;
        String numPosition = "";
        int resultMulti = 0;
        
        for (int i = 2; i <= 10000; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i %j == 0) {
                    cont++;
                }
            }
            if (cont != 2) {
                
            }else{
                
                inverso = invertirNumero(i);
                int primoItera = iteracion;
                posision = invertirNumero(iteracion);
                primoposision = primoPosition(posision);
                reverPrimoPos = invertirNumero(primoposision);
                numPosition = String.valueOf(reverPrimoPos);
                
                char[] digits = numPosition.toCharArray();
                int [] digitsInt = new int[digits.length];
                for (int j = 0; j < digits.length; j++) {    
                    digitsInt[j] =  Integer.parseInt(String.valueOf(digits[j]));
                }
                int result = 1; 
                for (int j = 0; j < digitsInt.length; j++) {
                   result = result * digitsInt[j];
                   resultMulti = result ;
                }
                
                if (resultMulti == primoItera) {
                    if (i == reverPrimoPos) {
//                        System.out.println("El número : " + i + " es primo.");
//                        System.out.println(inverso);
//                        System.out.println(primoItera);
//                        System.out.println(posision);
//                        System.out.println(primoposision);
//                        System.out.println(reverPrimoPos);
//                        System.out.println(resultMulti);
                        System.out.println("El número :" + i + " es un numero Sheldon..." );
                    }
                }
                iteracion++;
            }
        }
    }
    
}



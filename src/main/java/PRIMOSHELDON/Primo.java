/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRIMOSHELDON;

import java.util.*;

/**
 *
 * @author CarlosJr
 */
public class Primo {
    
    
    private int numPrimo;
    private int posPrimo;

    public Primo() {
    }

    public Primo(int numPrimo, int posPrimo) {
        this.numPrimo = numPrimo;
        this.posPrimo = posPrimo;
    }
    
    public int getNumPrimo() {
        return numPrimo;
    }

    public void setNumPrimo(int numPrimo) {
        this.numPrimo = numPrimo;
    }

    public int getPosPrimo() {
        return posPrimo;
    }

    public void setPosPrimo(int posPrimo) {
        this.posPrimo = posPrimo;
    }
    
    private boolean searchPrimo(Collection<Primo> p, int primo , int pos){
    
        for (Primo pri : p) {
            if(pri.getNumPrimo() == primo && pri.getPosPrimo() == pos){
                return true;
            }
        }
        return false;
    }
    
    private int invertirNumero(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }
    
    private List<Primo> primoPosition(){
        int div=0, I, con, posi=0;
        List<Primo> listaPrimo=new ArrayList<Primo>();
        for (con = 2; con <= 10000; con++) {
            for (I = 1; I <= con; I++) {
                if ((con % I) == 0) {
                    div++;
                }
            }
            if (div <= 2) {
                posi++;
                Primo primo=new Primo(con,posi);
                listaPrimo.add(primo);
            }
            div = 0;
        }
        return listaPrimo;
    }
    
    private int multiPrimo(int primo){
        int resultMulti = 0;
        int result = 1;
        String numPosition = "";
        numPosition = String.valueOf(primo);
        
        char[] digits = numPosition.toCharArray();

        for (int j = 0; j < digits.length; j++) {    
            result = result * Integer.parseInt(String.valueOf(digits[j]));
            resultMulti = result ;

        }
       return resultMulti;
   }
    
    
    public static void main(String[] args) {
        Primo p = new Primo();
        Primo primo;
        List<Primo> listPrimo = p.primoPosition();
        Iterator it = listPrimo.iterator();
        
        System.out.println("Los números primos Sheldon son :");
        while (it.hasNext()) {
            primo = (Primo)it.next();
            
            
            int reverPrimo = 0;
            int reverPrimoPos = 0;
            
            
            reverPrimo = p.invertirNumero(primo.numPrimo);
            reverPrimoPos = p.invertirNumero(primo.posPrimo);
            
            if (p.searchPrimo(listPrimo, reverPrimo, reverPrimoPos)) {
                if(p.multiPrimo(reverPrimo) == primo.posPrimo){
                    System.err.println("Número primo : " + primo.numPrimo + " Posision " + primo.posPrimo);
                }
                
            }
        }
        
    }
}



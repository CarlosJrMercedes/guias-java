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
public class Guia1 {
    
    private String customerName;
    private String acountNumber;
    private Double interestType;
    
    
    public Double getInterestType() {
        return interestType;
    }

    public void setInterestType(Double interestType) {
        this.interestType = interestType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }
    
    public Guia1() {
    }


    public Guia1(String customerName, String acountNumber, Double interestType) {
        this.customerName = customerName;
        this.acountNumber = acountNumber;
        this.interestType = interestType;
    }

    
    public Guia1(Guia1 guia1){
        this.customerName = guia1.customerName;
        this.acountNumber = guia1.acountNumber;
        this.interestType = guia1.interestType;
        
    }
    
    public static void main(String[] args) {
        
        Guia1 guia1 = new Guia1();
        Scanner esc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente :");
        String name = esc.nextLine();
        
        System.out.println("Ingrese el número de cuenta : ");
        String numero = esc.nextLine();
        
        System.out.println("Ingrese el interes de la cuenta : ");
        Double interest = esc.nextDouble();
        
        guia1.setCustomerName(name);
        guia1.setAcountNumber(numero);
        guia1.setInterestType(interest);
        
        
        System.out.println("Nombre : "+guia1.getCustomerName() +"\n"
                + "Número : " + guia1.getAcountNumber() + "\n" + 
                "Interes : " + guia1.getInterestType() );
        
        
    }
    
    
}

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
public class MainStore {
    
    
    
    public static void main(String[] args) {
        
        Scanner esc = new Scanner(System.in);
        Store store = new Store();
        
        
        System.out.println("Ingrese el nombre del cliente : ");
        store.setName(esc.nextLine());
        
        
        System.out.println("Ingrese el nombre del producto : ");
        store.setProductName(esc.nextLine());
        
        
        System.out.println("Ingrese el precio del priducto : ");
        store.setPrice(esc.nextDouble());
        
        
        System.out.println("Ingrese la cantidad de productos a facturar : ");
        store.setQuantity(esc.nextInt()); 
        
        
        System.out.println("Ingrese el código del departamento del productos ingresado : ");
        System.out.println("\n");
        System.out.println("CÓDIGO  :::::  DEPARTAMENTO\n");
        System.out.println("1       :::::  FRUTAS");
        System.out.println("2       :::::  VERDURAS");
        System.out.println("3       :::::  CARNES");
        System.out.println("4       :::::  LÁCTEOS");
        System.out.println("5       :::::  GRANOS BÁSICOS");
        store.setDepartment(esc.nextInt()); 
        
        Double total = store.total(store.getPrice(), store.getQuantity());
        
        Double discount = store.discount(total, store.getDepartment());
        
        System.out.println("FACTURA");
        System.out.println("Nombre del cliente : " + store.getName());
        System.out.println("Producto : " + store.getProductName());
        System.out.println("Precio : $ " + store.getPrice());
        System.out.println("Cantidad adquirida : " + store.getQuantity() + " libras");        
        if (discount != null) {
            double endTotal = total - discount;
            System.out.println("Descuento : $ " + discount);
            System.out.println("Total a pagar : $ " + endTotal);
        }else{
            System.out.println("Descuento : no se obtubo ningún descuento");
            System.out.println("Total a pagar : $ " + total);
        }
        
         
        
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA2;
import GUIA1.ProductInterface;
import java.util.Scanner;
/**
 *
 * @author CarlosJr
 */
public class Productos implements ProductInterface{

    private String productName;
    private String categorie;
    private Double price;
    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productNAme) {
        this.productName = productNAme;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Productos() {
    }

    public Productos(String productName, String categorie, Double price) {
        this.productName = productName;
        this.categorie = categorie;
        this.price = price;
    }
    
    public Productos(Productos guia2) {
        this.productName = guia2.productName;
        this.categorie = guia2.categorie;
        this.price = guia2.price;
    }
    
    
    
    
    @Override
    public Double calculateShipping(Double price) {
        Double shipping = price * 0.1;
        return shipping;
        
    }

    public static void main(String[] args) {
        Productos product = new Productos();
        Scanner esc = new Scanner(System.in);
        
        
        System.out.println("Ingrese el nombre del producto : ");
        String name = esc.nextLine();
        
        System.out.println("Ingrese la categoria del producto : ");
        String categorie = esc.nextLine();
        
        System.out.println("Ingrese el precio del productop");
        Double  price = esc.nextDouble();
        
        product.setProductName(name);
        product.setCategorie(categorie);
        product.setPrice(price);
        
        
        System.out.println("El costo de envio es : " + product.calculateShipping(product.getPrice()));
    }
    
    
    
   
    
    
    
}

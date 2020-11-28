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
public class Store {
    
    private String name;
    private String productName;
    private Double price;
    private int quantity;
    private int department;

    public Store() {
    }

    public Store(String name, String productName, Double price, int quantity, int department) {
        this.name = name;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.department = department;
    }
    
    public Store(Store store) {
        
        this.name = store.name;
        this.productName = store.productName;
        this.price = store.price;
        this.quantity = store.quantity;
        this.department = store.department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    
    
    public static Double total(Double price, int quantity){
    
        Double total =  price * quantity;
        return total;
    }
    
    public static Double discount(Double total, int dept){
        Double disc = null;
        if (total > 20) {
        
            disc = total * 0.05;
        } else{
            
//            1       :::::  FRUTAS
//            2       :::::  VERDURAS
//            3       :::::  CARNES
//            4       :::::  LÁCTEOS
//            5       :::::  GRANOS BÁSICOS
            
            if (dept == 1 || dept == 2 || dept == 3) {
                
                if (total > 50) {
                    disc = total * 0.07;
                }
            } 
        }
        return disc;
    }

    
}

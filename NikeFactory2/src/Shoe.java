/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chauk
 */
public class Shoe {
    private String country;
    private String code;
    private String product;
    private double cost;
    private int quantity;
    
    public Shoe(String country, String code, String product, double cost, int quantity){ //Constructors method
        this.country = country;
        this.code = code;
        this.product = product;
        this.cost = cost;
        this.quantity = quantity;
    }
    
    public double getCost(){ //get method
        return cost;
    }
    
    public int getQuantity(){
        return quantity;
    }
    

    public String getCode(){
        return code;
    }
    
    public String getProduct(){
        return product;
    }
     public void addQuantity(int amount){
        this.quantity +=amount;
    }
    public String toString(){
        return country + "," + code + "," + product + ", R" + String.format("%.2f",cost)
    }
    
}

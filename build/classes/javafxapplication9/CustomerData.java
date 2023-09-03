/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication9;

import java.util.Date;

/**
 *
 * @author Jethrow Cruz
 */
public class CustomerData {
    
    private Integer id;
    private String type;
    private String productname;
    private Integer quantity;
    private Double price;
    private String foodservice;
    private String payment;
    private Date date;
    
    public CustomerData(Integer id, String type, String productname, Integer quantity, Double price, String foodservice, String payment, Date date){
        this.id = id;
        this.type = type;
        this.productname = productname;
        this.quantity =quantity;
        this.price = price;
        this.foodservice = foodservice;
        this.payment = payment;
        this.date = date;
        
    }
    
    public Integer getID(){
        return id;
    }
    public void setID(Integer id) {
        this.id = id;
    }
    
    public String getType(){
        return type;
    }
    public String getProductname(){
        return productname;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Double getPrice(){
        return price;
    }
    public String getFoodservice(){
        return foodservice;
    }
    public String getPayment(){
        return payment;
    }
    public Date getDate(){
        return date;
    }
    @Override
public String toString() {
    return "CustomerData{" +
            "id=" + id +
            ", type='" + type + '\'' +
            ", productname='" + productname + '\'' +
            ", quantity=" + quantity +
            ", price=" + price +
            ", foodservice='" + foodservice + '\'' +
            ", payment='" + payment + '\'' +
            ", date=" + date +
            '}';
}
    
    
}

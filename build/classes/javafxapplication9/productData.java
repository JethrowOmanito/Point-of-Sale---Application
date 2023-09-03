/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication9;

import java.sql.Date;

/**
 *
 * @author Jethrow Cruz
 */
public class productData {
    
    private String productType;
    private String productName;
    private String status;
    private Double price;
    private String image;
    private Date date;
    
    public productData(String productType, String productName, String status, Double price, String image, Date date ){
        this.productType = productType;
        this.productName = productName;
        this.status = status;
        this.price = price;
        this.image = image;
        this.date = date;
    }
    
    public String getProductType(){
        return productType;
    }
    public String getProductName(){
        return productName;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
}

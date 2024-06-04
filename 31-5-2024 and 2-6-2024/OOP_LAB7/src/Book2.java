/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book2(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 1;
    }
    
    public Book2(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    //getter
    public String getName(){
        return this.name;
    }
    
    public Author[] getAuthor(){
        return this.authors;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    //setter
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQty(int qty){
        this.qty =  qty;
    }
    
}

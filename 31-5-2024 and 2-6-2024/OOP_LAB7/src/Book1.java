 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Book1 {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    //constructor - only 1 book
    public Book1(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price; 
        this.qty = 1;
    }
    
    //constructor - more than 1 book
    public Book1(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    
    //getter
    public String getName(){
        return this.name;
    }
    
    public Author getAuthor(){
        return this.author;
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
        this.qty = qty; 
    }
    
//    @Override
//    public String toString(){
//        return "Book[name= " + this.name + ", " + "Author[" +
//                "name= " + this.author.getName() + ", " + "email= " + 
//                this.author.getEmail() + ", " + "gender= " + 
//                this.author.getGender() + "]" + ", " + "price= " +
//                this.price + ", " + "qty= " + this.qty;
//    }
    
    @Override
    public String toString(){
        return "Book[name= " + this.name + ", " + "Author[" +
                this.author.toString() + ", " + "price= " +
                this.price + ", " + "qty= " + this.qty;
    }
    
//      @Override
//    public String toString(){
//        return "Book[name= " + this.name + ", " + "Author[" +
//                getAuthor().toString() + ", " + "price= " +
//                this.price + ", " + "qty= " + this.qty;
//    }
}

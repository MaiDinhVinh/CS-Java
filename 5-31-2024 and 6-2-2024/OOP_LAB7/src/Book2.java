
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
    
    
    //constructor
    public Book2(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0; //so luong ban in, not buy
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
    
    //method to return all author
//    public String returnAllInf(){
//        String n = "";
//        for(int i = 0; i < authors.length; i++){
//            n += authors[i].toString();
//            if(i == authors.length - 1){
//                continue;
//            } else{
//                n += ", ";
//            }
//        }
//        return n;
//    }
    
    
    
    @Override
    public String toString(){
        String n = "";
        for(int i = 0; i < authors.length; i++){
            n += authors[i].toString();
            if(i == authors.length - 1){
                continue;
            } else{
                n += ", ";
            }
        }
        
        return "Book= " + this.name + ", " + 
                "authors={ " + n + " }" + 
                ", " + "price= " + this.price + ", " + "qty= " + this.qty;
    }
    
    //1) để n ra ngoài => hỏng OOP và vứt n vào trong thì vẫn chạy đc
    //2) vì vòng lặp con cũng trỏ thẳng đến thằng attribute authors 
    //   nên nó sẽ lên đấy lấy cái array authors đấy về => k cần argument
    //CODE CŨ:
    /* 
    String n = "";
    public String returnAllInf(){
        
        for(int i = 0; i < authors.length; i++){
            n += authors[i].toString();
            if(i == authors.length - 1){
                continue;
            } else{
                n += ", ";
            }
        }
        return n;
    }
    
    
    
    @Override
    public String toString(){
        return "Book= " + this.name + ", " + 
                "authors={ " + returnAllInf(this.author) + " }" + 
                ", " + "price= " + this.price + ", " + "qty= " + this.qty;
    } */
    
    public String getAuthorNames(){
        String name = "";
        for(int i = 0; i < authors.length; i++){
            name += authors[i].getName();
            if(i == authors.length - 1){
                break;
            } else{
                name += ", ";
            }
        }
        return name;
    }
    
    //QUESTION: Vì sao method toString() bản 1 gửi trong zalo lại k chạy? 
    //ANSWER: Do gọi hàm returnAllInf() trong method toString() thì nó sẽ khởi chạy hàm return trước
    //sau đó mới return string
}

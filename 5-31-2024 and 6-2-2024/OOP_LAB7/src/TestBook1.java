/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class TestBook1 {
    public static void main(String[] args){
        Author JKRow = new Author("JKRow", "testing@.com", 'f');
        Book1 HP = new Book1("HP", JKRow, 15.2);
        
        Author who = new Author("who", "who@who.com", 'm');
        Book1 asked = new Book1("asked", who, 1.45, 100);
        
        System.out.println("book name: " + asked.getName());
        System.out.println("book price: " + asked.getPrice());
        System.out.println("book author: " + asked.getAuthor());
        System.out.println("book author name: " + asked.getAuthor().getName());
        System.out.println("book author email: " + asked.getAuthor().getEmail());
        System.out.println("book author gender: " + asked.getAuthor().getGender());
        System.out.println("book qty: " + asked.getQty());
        
        
    }
}

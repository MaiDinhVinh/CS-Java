/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class TestBook2 {
    public static void main(String[] args){
        Author[] tacgia = new Author[2];
        tacgia[0] = new Author("Nam Cao", "namcao@example.com", 'm');
        tacgia[1] = new Author("To Hoai", "tohoai@tohoai.com", 'm');
        Book2 demo1 = new Book2("tromcho", tacgia, 20);
//        System.out.println("book name: " + demo1.getName());
//        System.out.println("book price: " + demo1.getPrice());
//        System.out.println(demo1);
//        System.out.println(demo1.getAuthorNames());
        System.out.println(demo1.getAuthor()[0]);
        
   }
}
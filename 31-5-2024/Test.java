
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BachLV
 */
public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String txt = sc.nextLine();
        System.out.print("Enter shifting: ");
        int shift = sc.nextInt();
        if(shift < 0){
            shift = 0;//-1000(lui 1000 buoc) === thi tuong duong voi tien bao nhieu buoc 
            //khong duoc dung loop, chi dung toan xu ly
        }
        
        
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int length = alphabet.length();
        System.out.println(length);
        
        String eTxt = "";
        
        for(int i = 0; i < txt.length(); i++){
            String s = txt.substring(i, i + 1);
            int pos = alphabet.indexOf(s);
            int ePos = (pos + shift) % length; // still wrong
            System.out.println("epos" + ePos);
            eTxt += alphabet.charAt(ePos);
        }
        
        System.out.println("Encrypted: " + eTxt.toUpperCase());
    }
}

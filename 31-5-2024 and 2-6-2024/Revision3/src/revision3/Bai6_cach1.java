package revision3;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vingi
 */
public class Bai6_cach1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String o = sc.nextLine();
        System.out.print("Please enter shorter string: ");
        String p = sc.nextLine();
        
        char[] oarray = new char[o.length()];
        char[] parray = new char[p.length()];
        
        int index1 = 0;
        for(int i = 0; i < oarray.length; i++){
            oarray[i] = o.charAt(i);
            if(index1 == p.length()){
                continue;
            } else{
                parray[index1] = p.charAt(index1);
                index1++;
            }
        }
        
        
        
    }
    
}

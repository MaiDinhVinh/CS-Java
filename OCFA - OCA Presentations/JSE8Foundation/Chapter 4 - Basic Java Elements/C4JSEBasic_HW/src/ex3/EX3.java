package ex3;

public class EX3 {
    public static void main(String[] args) {
        int count = 0;
        for(String i: args){
            count++;
            System.out.println(i);
        }
        System.out.println("total: " + count);
    }
}


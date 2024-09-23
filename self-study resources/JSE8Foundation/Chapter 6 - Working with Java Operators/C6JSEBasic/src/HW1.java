public class HW1 {
    public static void main(String[] args) {
        String str = "7" + 5 + 10; //"7510"
        System.out.println("str ver 1: " + str);
        str = 7 + 5 + "10"; //"1210"
        System.out.println("str ver 2: " + str);
        str = "7" + (5 + 10); //"715"
        System.out.println("str ver 3: " + str);
        int m = 50;
        System.out.println("m before: " + m);
        int n = ++m; //51
        System.out.println("n: " + n);
        int o = m--; //51, but the updated value of m is 50
        System.out.println("o: " + o);
        int p = --o+m--; //101
        System.out.println("p: " + p);
        int x = m<n?n<o?o<p?p:o:n:m; //50
        System.out.println(x);
        int k = 4;
        boolean flag = k++ == 5; //false
        System.out.println(flag);
        flag = !flag; //true
        System.out.println("flag after: " + flag);


    }
}

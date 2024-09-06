import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Student{
    String name;
    Student(String n){ name = n; }
}
public class Main {
    public static void main(String[] args) {
        //snippet 1
        /*int[] a = new int[30];
        int i; //i is an int
        int[] ia1, ia2; //ia1 and ia2 are one dimensional arrays of ints
        int[][] iaa; //iaa is a two dimensional array of ints and so on*/

        //snippet 2
        /*int[2] invalid1;
        int[3][] invalid2;
        int[][4] invalid3;*/

        //snippet 3
        /*int i, ia[]; //i is an int but ia is a one dimensional array of int values
        int[] ia, iaa[]; //ia is a one dimensional array of ints but iaa is a two dimensional array of ints and so on*/

        //snippet 4
        /*Object[] obja, objaa[]; //obja is a one dimensional array of Objects but objaa is a two dimensional array of Objects
        String[] strA; //strA is a one dimensional array of Strings*/

        //snippet 5
        /*int[] ia = new int[10]; //an array of ints of size 10
        boolean[] ba = new boolean[3]; //an array of booleans of size 3
        String[] stra = new String[5]; //an array of Strings of size 5
        MyClass[] myca = new MyClass[5]; //an array of MyClass of size 5*/

        //snippet 6
        /*int[] invalid = new int[]; //missing size. will not compile*/

        //snippet 7
        /*int[] ia = new int[10];
        boolean[] ba = new boolean[3];
        String[] stra = new String[5];
        TestClass[] ta = new TestClass[5];
        System.out.println(ia.getClass().getName()
                +" , "+ia.getClass().getSuperclass().getName());
        System.out.println(ba.getClass().getName()
                +" , "+ba.getClass().getSuperclass().getName());
        System.out.println(stra.getClass().getName()
                +" , "+stra.getClass().getSuperclass().getName());
        System.out.println(ta.getClass().getName()
                +" , "+ta.getClass().getSuperclass().getName());*/

        //snippet 8
        /*int[] ia = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //an array of ints of size 10
        boolean[] ba = {true, false, false}; //an array of booleans of size 3
        String[] str = {"a", "b", "c", "d", "e"}; //an array of Strings of size 5
        MyClass[] myca = { new MyClass(), new MyClass(), new MyClass(), new MyClass(), new MyClass()} ; //an array of MyClass objects of size 5*/

        //snippet 9
        /*int[] ia = new int[]{ 1, 2, 3, 4, 5 };*/

        //snippet 10
        /*int[] ia = new int[2]{ 1, 2 }; //will not compile.*/

        //snippet 11
        /*String[] sa = { "1", "2", "3" };
        Object[] oa = sa;
        oa[0] = new Object();*/

        //snippet 12
        /*Number[] na = { 1, 2, 3 };
        na[0] = new Float(1.2f);*/

        //snippet 13
        /*ArrayList al = new ArrayList();
        al.add("alice"); //[alice]
        al.add("bob"); //[alice, bob]
        al.add("charlie"); //[alice, bob, charlie]
        al.add(2, "david"); //[alice, bob, david, charlie]
        al.remove(0); //[bod, david, charlie]
        for(Object o : al){ //process objects in the list
            String name = (String) o;
            System.out.println(name+" "+name.length());
        }
        //dump contents of the list
        System.out.println("All names: "+al);*/

        //snippet 14
        /*ArrayList<String> al = new ArrayList<String>();
        al.add(new Object());*/

        //snippet 15
        /*List<String> al = new ArrayList<String>(); //al points to a List of Strings
        al.add("hello"); //valid
        String s = al.get(0); //valid, no cast required
        Object obj = al.get(0); //valid because a String is-a Object
        Integer in = al.get(0); //Invalid. Will not compile*/

        //snippet 16
        /*List list = new ArrayList(); //ok because ArrayList is a List
        ArrayList<String> al2 = new ArrayList<String>(list);
        List<Student> list1 = new ArrayList<>();*/

        //snippet 17
        /*ArrayList<String> sList1 = new ArrayList<>(); //observe the usage of the diamond operator
        sList1.add("a"); //[a]
        ArrayList<String> sList2 = new ArrayList<>();
        sList2.add("b"); //[b]
        sList2.addAll(sList1); //sList2 now contains [b, a]*/

        //snippet 18
        /*ArrayList<String> sList1 = new ArrayList<>();
        sList1.add("a"); //[a]
        ArrayList<String> sList3 = new ArrayList<>();
        sList3.add("b"); //[b]
        sList3.addAll(0, sList1); //sList3 now contains [a, b]*/

        //snippet 19
        /*ArrayList<String> list = new ArrayList<>(); // an ArrayList containing [a, b, c]
        list.add("a");
        list.add("b");
        list.add("c");
        String s = list.remove(1); //list now has [a, c]*/

        //snippet 20
        /*ArrayList<Integer> list = new ArrayList<>(Arrays.asList( new Integer[]{1, 2, 3 }));
        list.remove(1);
        System.out.println(list);
        list = new ArrayList<>(Arrays.asList( new Integer[]{1, 2, 3 } ));
        list.remove(new Integer(1));
        System.out.println(list);*/

        //snippet 21
        /*ArrayList<String> al1 = new ArrayList<>(Arrays.asList( new String[]{"a", "b",
                "c", "a" } ));
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList( new String[]{"a", "b" } ));
        al1.removeAll(al2);
        System.out.println(al1); //prints [ c ]*/

        //snippet 22
        /*ArrayList<String> al = new ArrayList<>(); // an ArrayList containing [a, b, c]
        al.add("a");
        al.add("b");
        al.add("c");
        String oldVal = al.set(1, "x");
        System.out.println(al); //prints [a, x, c]
        System.out.println(oldVal); //prints b*/

        //snippet 23
        /*ArrayList<String> al = new ArrayList<>();
        al.addAll(Arrays.asList( new String[]{"a", null, "b", "c" } ));
        System.out.println(al.contains("c")); //prints true
        System.out.println(al.contains("z")); //prints false
        System.out.println(al.contains(null)); //prints true*/

        //snippet 24
        /*ArrayList<String> al = new ArrayList<>();
        al.addAll(Arrays.asList( new String[]{"a", null, "b", "c", null } ));
        System.out.println(al.indexOf("c")); //prints 3
        System.out.println(al.indexOf("z")); //prints -1
        System.out.println(al.indexOf(null)); //prints 1*/

        //snippet 25
        /*ArrayList<String> al = new ArrayList<>(); //observe the usage of the diamond operator
        if( al.add("a") ){
            if( al.contains("a") ){
                al.add(al.indexOf("a"), "b");
            }
        }
        System.out.println(al);*/

        //snippet 26
        /*ArrayList<String> al = new ArrayList<>();
        al.add("a"); al.add("b");
        al.add(al.size(), "x");
        System.out.println(al);*/

        //snippet 27
        /*ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add( "a"); list1.add("b");
        list2.add("b"); list2.add("c"); list2.add("d");
        list1.addAll(list2);
        System.out.println(list1);
        list1.remove("b");
        System.out.println(list1);*/

        //snippet 28
        /*ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add( "a"); list1.add("b");
        list2.add("b"); list2.add("c"); list2.add("d");
        list1.addAll(list2);
        list1.removeAll("b");
        System.out.println(list1);*/

        //snippet 29 (check the class above main method too)
        /*List<Student> students = new ArrayList<>();//adding a few Students to the list
        students.add(new Student("alice")); students.add(new Student("bob"));
        students.add(new Student("chad"));
        int size = students.size();
        //using a regular for loop
        for(int i=0; i<size; i++){
            System.out.println(students.get(i).name);
        }
        //using the enhanced for loop
        for(Student s : students){
            System.out.println(s.name);
        }
        //using java.util.Iterator
        java.util.Iterator it = students.iterator();
        while(it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.name);
        }*/
    }
}

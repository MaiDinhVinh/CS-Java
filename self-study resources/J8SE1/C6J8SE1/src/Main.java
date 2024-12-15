import java.io.FileReader;
import java.io.IOException;

public class Main{
    //for snippet 2
    /*public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }
        }
        return -1; //focus on the return value
    }*/

    //for snippet 5
    /*void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            //getUp();
        }
        //seeAnimals();
    }
    void fall() {
        throw new RuntimeException(); //what type of throw is this called ?
    }*/

    //for snippet 9
    /*void explore() {
        try {
            //seeAnimals();
            //fall();
        } catch (Exception e) {
            //getHugFromDaddy();
        } finally {
            //seeMoreAnimals();
        }
        //goHome();
    }*/

    //for snippet 19
    /*private static FileReader read() throws IOException {
        // CODE GOES HERE
    }*/

    //for snippet 21 - what does this method print out ?
    /*public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
                result += "done";
        }
        return result;
    }*/

    //for snippet 23
    /*public static void test1(int a){
        if(a == 10) System.out.println("hello");
        else throw new IllegalArgumentException("wrong param");
    }*/

    //for snippet 35
    /*private static void hop() {
        throw new RuntimeException("cannot hop");
    }*/
    public static void main(String[] args) throws Exception{
        //snippet 1 - check Zoo class

        //snippet 2 - check indexOf method

        //snippet 3
        /*String[] animals = new String[0];
        System.out.println(animals[0]);*/

        //snippet 4
//        throw new Exception();
//        throw new Exception("Ow! I fell.");
//        throw new RuntimeException();
//        throw new RuntimeException("Ow! I fell.");

        //snippet 5 - check explore and fall method

        //snippet 6
        /*try
            //fall();
        catch (Exception e)
            System.out.println("get up");*/

        //snippet 7
        /*try {
            //fall();
        } catch (Exception e) {
            System.out.println("get up");
        }*/

        //snippet 8
        /*try {
            //fall();
        }*/

        //snippet 9 - check explore method

        //snippet 10
        /*try {
            //fall();
        } finally {
            System.out.println("all better");
        } catch (Exception e) {
            System.out.println("get up");
        }*/

        //snippet 11
        /*try{
//            fall();
        }*/

        //snippet 12
        /*try{
            //fall();
        }finally{
            System.out.println("all better");
        }*/

        //snippet 13
        /*String s = "";
        try {
            s += "t";
        } catch(Exception e) {
            s += "c";
        } finally {
            s += "f";
        }
        s += "a";
        System.out.print(s); //what does this will print out ?*/

        //snippet 14 - check Main2 class

        //snippet 15 - also check Main2 class

        //snippet 16 - also check Main2 class

        //snippet 17 - also check Main2 class

        //snippet 18 - also cheeck Main2 class

        //snippet 19 - check FileReader method too
        /*FileReader reader = null;
        try {
            reader = read();
            } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }*/

        //snippet 20
        /*try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }*/

        //snipept 21 - check exceptions method

        //snippet 22
        /*Object obj = "hello";
        Number num = (Number)obj;*/

        //snippet 23 - check test1 method

        //snippet 24
        /*int a = Integer.parseInt("abc");*/

        //snippet 25 - check Main3 class

        //snippet 26 - check Main4 class

        //snippet 27 - check Main5 class

        //snippet 28 - also check Main5 class

        //snippet 29 - also check Main5 class

        //snippet 30 - check Main6 class

        //snippet 31 - check Main7 class

        //snippet 32 - check Main8 class

        //snippet 33 - check Main9 class

        //snippet 34 - check Main10 class

        //snippet 35 - also check Hop method
        /*try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/

        //snippet 36 - check Main11 class
    }
}
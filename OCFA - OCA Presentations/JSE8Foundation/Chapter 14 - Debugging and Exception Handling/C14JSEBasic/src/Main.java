import java.io.IOException;

public class Main{
    /*public void copyFile(String inputPath, String outputPath) throws IOException {
        //code to copy file
    }*/

    /*public void createBackup(String input) {
        String output = input+".backup";
        try{
            copyFile(input, output);
            System.out.println("backup successful");
        }catch(IOException ioe){
            System.out.println("backup failure");
        }
    }*/

    /*public void createBackup(String input) throws IOException{
        String output = input+".backup";
        copyFile(input, output);
        System.out.println("backup successful");
    }*/

    /*public double computeSimpleInterest(double p, double r, double t){
        if( t<0) {
            IllegalArgumentException iae = new IllegalArgumentException("time is less than 0");
            throw iae;
        }
        return 1.0; //THIS IS FOR DEMONSTRATION ONLY !, the original code doesn't contain this line
    }*/

    /*public double computeSimpleInterest(double p, double r, double t){
        if( t<0) {
            throw new IllegalArgumentException("time is less than 0");
        }
        return 1.0; //THIS IS FOR DEMONSTRATION ONLY !, the original code doesn't contain this line
    }*/

    /*public void printLength(String str){
        System.out.println(str.length());
    }*/

    /*public double computeSimpleInterest(double p, double r, double t) throws Exception{
        if( t<0) throw new Exception("time is less than 0");
        return 1.0; //THIS IS FOR DEMONSTRATION ONLY !, the original code doesn't contain this line
    }*/

    /*public void doInterest(){
        try{
            double interest = computeSimpleInterest(1000.0, 10.0, -1);
            System.out.println("Computed interest "+interest);
        }catch(Exception e){
            System.out.println("Problem in computing interest:"+e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("all done");
        }
    }*/

    /*void process(int x) throws Exception{
        if(x == 2) throw new Exception();
        else return;
    }*/

    /*void process() {
        if(someCondition) throw new RuntimeException();
        else throw new Error();
    }*/

    /*void process() throws Exception{
        System.out.println("hello");
    }*/

    /*//NOTICE THAT THERE IS NO THROW CLAUSE !!!
    void process1() {
        try{
            if(someCondition) throw new Exception();
            else return;
        }catch(Exception e){
        }
    }*/

    /*//LOOK AT THE TRY METHOD !, WHY WE STILL NEED THROWS CLAUSE ?
    void process2() throws Exception{
        try{
            if(someCondition) throw new Exception();
            else return;
        }finally {
            System.out.println("in finally");
        }
    }*/



    public static void main(String[] args) {
        //snippet 1
        /*if(checkFileAccess(file1)){
            if(checkWritePermission(targetDirectory){
                //code for normal course of action
            }else{
                System.out.println("Unable to create file2");
            }
        }else{
            System.out.println("Unable to read file1");
        }*/

        //snippet 2
        /*try{
            //code for normal course of action
        }catch(SecurityException se){
            //code for known exceptional situation
            System.out.println("No permission!");
        }
        catch(Throwable t){
            //code for unknown exceptional situations
            System.out.println("Some problem in copying: "+t.getMessage());
            t.printStackTrace();
        }*/

        //snippet 3 - check method copyFile
        //snippet 4 - check createBackup method
        //snippet 5 - check createBackup method (the 2nd ver)
        //snippet 6 - check computeSimpleInterest
        //snippet 7 - check computeSimpleinterest (the 2nd ver)
        //snippet 8 - check printLength method
        //snippet 9 - check computeSimpleInterest (the 3rd ver)
        //snippet 10
        /*try {
            //code that might throw exceptions
        }catch(<ExceptionClass1> e1){
            //code to execute if code in try throws exception 1
        }catch(<ExceptionClass2> e2){
            //code to execute if code in try throws exception 2
        }catch(<ExceptionClassN> en){
            //code to execute if code in try throws exception N
        }finally{
            //code to execute after the try block and catch block finish execution
        }*/

        //snippet 11 - check doInterest method
        //snippet 12 - check main2
        //snippet 13
        /*int k = 10;
        k = 10/0;*/

        //snippet 14
        /*int[] ia = new int[]{ 1, 2, 3};
        System.out.println(ia[-1]);
        System.out.println(ia[3]);
        System.out.println("0123".charAt(4));*/

        //snippet 15
        /*String s = null;
        System.out.println(s.length());*/

        //snippet 16 - check process method
        //snippet 17 - check process method (the 2nd ver)
        //snippet 18 - check process method (the 3rd ver)
        //snippet 19 - check process1 method
        //snippet 20 - check process2 method
        //snippet 21 - check main3
        //snippet 22 - check main4
        //snippet 23 - check main5 and main6
        //snippet 24 - check main7
        //snippet 25 - check main8
    }
}
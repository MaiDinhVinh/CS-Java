//THIS IS FOR SECTION 4.5.1 (THIS IS FOR THE START OF THE SECTION 4.5)
package accounting;
public class Account {
    public static void main(String[] args) {
        System.out.println("im Account class and my package statement is accounting");
    }
}

/*
* Let's try this:
* - First, copy this code and create a file called Account.java
* and put it anywhere
* - Then, go to the command line and compile Account.java using "javac" command
* - After that, on the same directory that has the Account.java file, run the
* Java file using "java" command => Observe what you see
* - Now, delete the ".class" file and recompile the file using this command below:
* "javac -d . Account.java"
* - After that, run both of these commands and observe:
* "java accounting.Account" OR "java -classpath . accounting.Account"
* OR "java -cp . accounting.Account"
* */

/*
class Account{
    int id;
    String name;

    Account(String name){
        System.out.println("calling two args constructor");
        this(111, name); //call to another constructor must be the first line
    }
    Account(){
        this(111);
        this(111, "amy"); //call to another constructor must be the first line
    }
    Account(String name){
        Account(111, name); //incorrect way to call to another constructor but if the Account class had a method named Account, this would be a valid call to that method
    }
}
*/

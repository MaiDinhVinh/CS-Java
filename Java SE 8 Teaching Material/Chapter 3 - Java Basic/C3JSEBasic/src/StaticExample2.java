class Account {
    String accountNumber;
    static int numberOfAccounts;
}

class Deploy1{
    public static void main(String[] args) {
        System.out.println(Account.numberOfAccounts);
        //Create a new Account instance
        Account acct1 = new Account();
        //This Account instance has its own accountNumber field
        acct1.accountNumber = "A1";
        //But the numberOfAccounts fields does not belong to the instance, it belongs to theAccount class
        Account.numberOfAccounts = Account.numberOfAccounts + 1;
        //Create another Account instance
        Account acct2 = new Account();
        //This instance has its own accountNumber field
        acct2.accountNumber = "A2";
        //the following line accesses the same class field and therefore, numberOfAccounts isincremented to 2
        Account.numberOfAccounts = Account.numberOfAccounts + 1;
    }
}

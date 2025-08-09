interface StringChecker {
    boolean check();
}

class Test3{
    public static void main(String[] args) {
        var str = "";
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();
        System.out.print(methodRef.check());

        //for snippet 14
        var str2 = "";2
        StringChecker lambda2 = () -> str.startsWith("Zoo");

        //explain these ?

//        StringChecker methodReference = str::startsWith;
//        StringChecker methodReference = str::startsWith("Zoo");
    }
}
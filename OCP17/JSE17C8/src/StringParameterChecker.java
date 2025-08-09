interface StringParameterChecker {
    boolean check(String text);
}

class Test4{
    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo"));
    }
}
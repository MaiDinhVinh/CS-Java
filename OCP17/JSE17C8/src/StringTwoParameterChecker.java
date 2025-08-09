interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

class Test5{
    public static void main(String[] args) {
        StringTwoParameterChecker methodRef = String::startsWith;
        StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);
        System.out.println(methodRef.check("Zoo", "A"));
    }
}
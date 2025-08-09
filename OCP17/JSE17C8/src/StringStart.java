interface StringStart {
    boolean beginningCheck(String prefix);
}

class Test2{
    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);
        System.out.println(methodRef.beginningCheck("A"));
    }
}
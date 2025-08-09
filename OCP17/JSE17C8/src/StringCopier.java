interface StringCopier {
    String copy(String value);
}

class Test7{
    public static void main(String[] args) {
        StringCopier methodRef = String::new;
        StringCopier lambda = x -> new String(x);

        var myString = methodRef.copy("Zebra");
        System.out.println(myString.equals("Zebra"));
    }
}
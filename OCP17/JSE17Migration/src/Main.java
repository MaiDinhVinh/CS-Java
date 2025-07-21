import java.util.List;

public class Main {

    //for snippet 15

//    public int addition(var a, var b) {
//        return a + b;
//    }

    //for snippet 18

    public void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer) time + " O'clock");
        else
            System.out.print(time);
    }

    //for snippet 19
    void compareIntegers1(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.print(data.compareTo(5));
        }
    }

    //for snippet 20

    void compareIntegers2(Number number) {
        if (!(number instanceof Integer data)) {
            return;
        } else {
            System.out.println(data);
        }
    }

    //for snippet 23
    void printIntegersGreaterThan5Ver1(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.print(data);
    }

    //for snippet 25

    void printIntegersOrNumbersGreaterThan5Ver2(Number number) {
//        if(number instanceof Integer data || data.compareTo(5)>0)
//            System.out.print(data);
    }

    //for snippet 26
    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        //System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    //for snippet 27
    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }

    //for snippet 31
    public void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid value");
                break;
        }
    }

    public static void main(String[] args) {
        //snippet 1

//        String simple1 = "hello world";

        //snippet 2

//        String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";

        //snippet 3

//        String textBlock = """
//                "Java Study Guide"
//                 by Scott & Jeanne""";

        //snippet 4

//        String pyramid = """
//                  *
//                 * *
//                * * *
//                """; //Explain this part ? (the double quote)
//        System.out.print(pyramid);

        //snippet 5

        //String block = """doe""";

        //snippet 6

//        String block1 = """
//                doe \
//                deer""";

        //snippet 7

//        String block2 = """
//                doe \n
//                deer
//                """;

        //snippet 8

//        String block = """
//                 "doe\"\"\"
//                 \"deer\"""
//                """;

        //snippet 9

//        var name = "Hello";
//        var size = 7;

        //snippet 10 - check Main2 class

        //snippet 11

//        var number = 7;
//        number = 4;
//        //number = "five";

        //snippet 12

//        var silly
//                = 1;

        //snippet 13

//        var question;
//        question = 1;
//        var answer;
//
//        if (check) {
//            answer = 2;
//            } else {
//            answer = 3;
//            }
//        System.out.println(answer);

        //snippet 13
//        var a = 10, b = 12;

        //snippet 14

        //int a, var b = 3;
        //var n = null;

        //snippet 15 - check method addition above

        //snippet 16 - check "var" package

        //snippet 17

//        Integer zooTime = Integer.valueOf(9);
//        Number num = zooTime;
//        Object obj = zooTime;

        //snippet 18 - check openZoo method above

        //snippet 19 - check compareIntegers1 method above

        //snippet 20 - check compareIntegers2 method above

        //snippet 21

//        Number number1 = 123;
//        if (number1 instanceof Integer data) {
//            data = 12;
//        }

        //snippet 22

//        Number number2 = 123;
//        if (number1 instanceof final Integer data) {
//            //data = 12;
//        }

        //snippet 23 - check printIntegersGreaterThan5Ver1 method above

        //snippet 24

//        Integer value = 123;
//        if (value instanceof Integer) {
//        }
//        //if(value instanceof Integer data) {}

        //snippet 25 - check printIntegersGreaterThan5Ver2 method above

        //snippet 26 - check printIntegerTwice method above

        //snippet 27 - check printOnlyInteger method above

        //snippet 28

//        Number number3 = 123;
//        if (!(number3 instanceof Integer data))
//            return;
//        else {
//            System.out.print(data.intValue());
//        }
//
//        //snippet 29
//        if (number3 instanceof Integer data2)
//            System.out.print(data2.intValue());
//        else
//            return;

        //snippet 30

//        int a = 10;
//        switch (a) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2, 3, 4, 5, 6, 7, 8, 9:
//                System.out.println("other numbers");
//                break;
//            default:
//                System.out.println("default");
//                break;
//            case 10:
//                System.out.println("10");
//                break;
//        }

        //snippet 31 - check printDayOfWeek method above

        //snippet 32

//        int s = 10;
//        int b = switch (s) {
//            case 1 -> 10;
//            case 2 -> 30;
//            case 10 -> {
//                yield 40;
//            }
//            default -> {
//                yield 100;
//            }
//        };

        //snippet 33

//        int hello = 10;
//        switch(hello) {
//            case 1 -> System.out.println("hello");
//            case 2 -> System.out.println("hi");
//            case 3,4,5,6 -> {
//                System.out.println("other");
//                System.out.println("numbers");
//            }
//            default -> System.out.println("10");
//        }

        //snippet 34

//        String tb1 = """
//                Hello, my name is Vinh
//                How are you today?""";
//        System.out.print(tb1.indent(2));
//        System.out.print(tb1.indent(-1));
//        System.out.print(tb1.indent(0));

        //snippet 35

//        String tb2 = "Hello\n" + "My name is Vinh\n" + "How are you today?";
//        System.out.print(tb2.indent(0));
//        System.out.print(tb2.indent(2));
//        System.out.print(tb2.indent(-1));

        //snippet 36

//        String tb3 = "Hello" + "My name is Vinh" + "How are you today";
//        System.out.print(tb3.indent(1));

        //snippet 37 - AI is dumb

//        String literalPhrase = "" +
//                "    {\n" +
//                "      greeting: \"hello\",\n" +
//                "      audience: \"text blocks\"\n" +
//                "    }"; //the AI added a \n in this line => causing confusion
//        String cleaned = literalPhrase.stripIndent();
//        System.out.print(cleaned);

        //snippet 38

//        var str = "1\\t2";
//        System.out.println(str);
//        System.out.println(str.translateEscapes());

        //snippet 39

//        var name = "Kate";
//        var orderId = 5;
//        System.out.println("Hello "+name+", order "+orderId+" is ready");
//        System.out.println(String.format("Hello %s, order %d is ready",
//                name, orderId));
//        System.out.println("Hello %s, order %d is ready"
//                .formatted(name, orderId));

        //snippet 40

//        var name = "James";
//        var score = 90.25;
//        var total = 100;
//        System.out.println("%s:%n Score: %f out of %d"
//                .formatted(name, score, total));

        //snippet 41

//        var name = "James";
//        var score = 90.25;
//        var total = 100;
//        System.out.println("%s:%n Score: %.1f out of %d"
//                .formatted(name, score, total));
//        System.out.println("%s:%n Score: %.2f out of %d"
//                .formatted(name, score, total));

        //snippet 42

//        var name = "James";
//        var score = 90.25;
//        var total = 100;
//        System.out.println("%s:%n Score: %5.2f out of %d"
//                .formatted(name, score, total));

        //snippet 43

//        System.out.println("%1.0f".formatted(443.234));
//        System.out.println("%1.4f".formatted(443.234));

        //snippet 44
        System.out.println("%8.3f".formatted(443.234));
        System.out.println("%9.4f".formatted(443.234));
        System.out.println("%08.3f".formatted(443.234));
        System.out.println("%09.4f".formatted(443.234));
    }
}
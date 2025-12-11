import java.time.*;
import java.time.chrono.*;
import java.time.zone.*;
import java.time.temporal.*;
import java.util.Arrays;
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
        if (number instanceof Integer data) {
            System.out.println(data.compareTo(5));
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
        if (!(number instanceof Integer data))
            System.out.println("hello world");
        else
            System.out.print(data.intValue());
    }

    //for snippet 27
    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        else
            System.out.print(data.intValue());
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

    //for snippet 55

    private static void performAnimalEnrichment1(LocalDate start, LocalDate end) {
        var upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        } }

    //for snippet 56

    private static void performAnimalEnrichment2(LocalDate start, LocalDate end,
                                                Period period) { // uses the generic period
        var upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        } }


    //for snippet 72
    public void oneException() throws IllegalArgumentException {}

    //for snippet 73
    public void twoExceptions() throws
            IllegalArgumentException, InterruptedException {}

    //for snippet 74 - which one is "effectively ..." ?
    public String zooFriends() {
        String name = "Harry the Hippo";
        var size = 10;
        boolean wet;
        if(size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }

    //for snippet 75
    public static void walk1(int... steps) {
        //for snippet 77
        int[] step2 = steps;
        System.out.print(step2.length);
    }
    public static void walk2(int start, int... steps) {}
//    public static void walk3(int... steps, int start) {}
//    public static void walk4(int... start, int... steps) {}

    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }

    //for snippet 81
    
//    public void fly(int[] lengths) {}
//    public void fly(int... lengths) {}

    public static void main(String[] args) {
        //snippet 1

//        String simple1 = "hello world";

        //snippet 2

//        String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";
//        System.out.println(eyeTest);

        //snippet 3

//        String textBlock = """
//                "Java Study Guide"
//                 by Scott & Jeanne""";

        //snippet 4

//        String pyramid = """
//                  *
//                 * *
//                * * *"""; //Explain this part ? (the double quote)
//        System.out.print(pyramid);

//        String hello = """
//                        Helloworld   \s""";
//        String hello2 = "helloworld    \s";
//        System.out.print(hello);
//        System.out.println("\n");
//        System.out.print(hello2);

        //snippet 5

//        String block = """doe""";

        //snippet 6

//        String block1 = """
////                doe \
////                deer""";
//        System.out.println(block1);

        //snippet 7

//        String block2 = """
//                doe \n
//                deer
//                """;
//        System.out.print(block2);

        //snippet 8

//        String block = """
//                 "doe\"\"\"
//                 \"deer\"""
//                """;
//        System.out.println(block);

        //snippet 9

//        var name = "Hello";
//        var size = 7;

        //snippet 10 - check Main2 class

        //snippet 11

//        var number = 7;
//        number = 4;
////        number = "five";

        //snippet 12

//        var silly
//                = 1;
//        int a
//                = 1;

        //snippet 13

//        var question;
//        question = 1;
//        var answer;
//
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//        System.out.println(answer);

//        snippet 13
//        var a = 10, b = 12;

        //snippet 14

//        int a, var b = 3;
//        var n = null;

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
//        if (number2 instanceof final Integer data) {
////            data = 12;
//        }

        //snippet 23 - check printIntegersGreaterThan5Ver1 method above

        //snippet 24

//        Integer value = 123;
//        if (value instanceof Integer) {
//        }
//        if(value instanceof Integer data) {}

        //snippet 25 - check printIntegersGreaterThan5Ver2 method above

        //snippet 26 - check printIntegerTwice method above

        //snippet 27 - check printOnlyInteger method above

        //snippet 28

//        Number number3 = 123;
//        if (!(number3 instanceof Integer data))
//            return;
//        else
//            System.out.print(data.intValue());
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
//                System.out.println("hello world");
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
//        tb1 = tb1.indent(2);
//        tb1 = tb1.indent(-1);
//        tb1 = tb1.indent(0);
//        System.out.println(tb1);

        //snippet 35

//        String tb2 = "Hello\n" + "My name is Vinh\n" + "How are you today?";
//        System.out.print(tb2.indent(0));
//        System.out.print(tb2.indent(2));
//        System.out.print(tb2.indent(-1));

        //snippet 36

//        String tb3 = "Hello" + "My name is Vinh" + "How are you today";
//        System.out.print(tb3.indent(1));

        //snippet 37

//        var concat = " a\n"
//        + "  b\n"
//        + " c";
//        System.out.println(concat.indent(-1));

        //snippet 38

//        var str = "1\tc";
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
//        System.out.println("%s:%n Score: %.3f out of %d"
//                .formatted(name, score, total));

        //snippet 42

//        var name = "James";
//        var score = 90.25;
//        var total = 100;
//        System.out.println("%s:%n Score: %06.2f out of %d"
//                .formatted(name, score, total));

        //snippet 43

//        System.out.println("%1.0f".formatted(443.234));
//        System.out.println("%-1.4f".formatted(443.234));

        //snippet 44
//        System.out.println("%8.3f".formatted(443.234));
//        System.out.println("%9.4f".formatted(443.234));
//        System.out.println("%08.3f".formatted(443.234));
//        System.out.println("%09.4f".formatted(443.234));


        ////////////////////////////////////////////////////////////////////////
        ////// SECTION 2
        ////////////////////////////////////////////////////////////////////////

        //snippet 45

//        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

        //snipept 46
//        System.out.println(Arrays.compare(new int[] {1}, new String[] {"a"}));

        //snippet 47
//        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
//        System.out.println(Arrays.mismatch(new String[] {"a"},
//                new String[] {"A"}));
//        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));

        //snippet 48
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(ZonedDateTime.now()); //explain printed output

        //snippet 49

//        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
//        var date2 = LocalDate.of(2022, 1, 20);

        //snippet 50

//        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
//        var date2 = LocalDate.of(2022, 1, 20);
//        var time1 = LocalTime.of(6, 15);
//        var time2 = LocalTime.of(6, 15, 30);
//        var time3 = LocalTime.of(6, 15, 30, 200);
//        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
//        var dateTime2 = LocalDateTime.of(date1, time1);
//        var zone = ZoneId.of("US/Eastern");
//        var zoned1 = ZonedDateTime.of(2022, 1, 20,
//                6, 15, 30, 200, zone);
//        var zoned2 = ZonedDateTime.of(date1, time1, zone);
//        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        //snippet 51

//        var d = new LocalDate();

        //snippet 52

//        var d = LocalDate.of(2022, Month.JANUARY, 32);

        //snippet 53

//        var date = LocalDate.of(2024, Month.JANUARY, 20);
//        var time = LocalTime.of(5, 15);
//        var dateTime = LocalDateTime.of(date, time)
//                .minusDays(1).minusHours(10).minusSeconds(30);

        //snippet 54

//        var date = LocalDate.of(2024, Month.JANUARY, 20);
//        date.plusDays(10); // ?
//        System.out.println(date);

        //snippet 55 - check performAnimalEnrichment1 method above

//        var start = LocalDate.of(2022, Month.JANUARY, 1);
//        var end = LocalDate.of(2022, Month.MARCH, 30);
//        performAnimalEnrichment1(start, end);

        //snippet 56 - check performAnimalEnrichment2 method above

//        var start = LocalDate.of(2022, Month.JANUARY, 1);
//        var end = LocalDate.of(2022, Month.MARCH, 30);
//        var period = Period.ofMonths(1); // create a period
//        performAnimalEnrichment2(start, end, period);

        //snippet 57

//        var annually = Period.ofYears(1);
//        var quarterly = Period.ofMonths(3);
//        var everyThreeWeeks = Period.ofWeeks(3);
//        var everyOtherDay = Period.ofDays(2);
//        var everyYearAndAWeek = Period.of(1, 0, 7);

        //snippet 58

//        var wrong = Period.ofYears(1).ofWeeks(1);

        //snippet 59

//        var wrong = Period.ofYears(1);
//        wrong = Period.ofWeeks(1);

        //snippet 60

//        System.out.println(Period.ofMonths(3));

        //snippet 61
//        var date = LocalDate.of(2022, 1, 20);
//        var time = LocalTime.of(6, 15);
//        var dateTime = LocalDateTime.of(date, time);
//        var period = Period.ofMonths(1);
//        System.out.println(date.plus(period));
//        System.out.println(dateTime.plus(period));
//        System.out.println(time.plus(period));

        //snippet 62

//        var daily = Duration.ofDays(1);
//        var hourly = Duration.ofHours(1);
//        var everyMinute = Duration.ofMinutes(1);
//        var everyTenSeconds = Duration.ofSeconds(10);
//        var everyMilli = Duration.ofMillis(1);
//        var everyNano = Duration.ofNanos(1);

        //snippet 63

//        var daily = Duration.of(1, ChronoUnit.DAYS);
//        var hourly = Duration.of(1, ChronoUnit.HOURS);
//        var everyMinute = Duration.of(1, ChronoUnit.MINUTES);
//        var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
//        var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
//        var everyNano = Duration.of(1, ChronoUnit.NANOS);

        //snippet 64

//        var one = LocalTime.of(5, 15);
//        var two = LocalTime.of(6, 30);
//        var date = LocalDate.of(2016, 1, 20);
//        System.out.println(ChronoUnit.HOURS.between(one, two)); //1
//        System.out.println(ChronoUnit.MINUTES.between(one, two)); //75
//        System.out.println(ChronoUnit.MINUTES.between(one, date)); //?

        //snippet 65

//        LocalTime time = LocalTime.of(3,12,45);
//        System.out.println(time);
//        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
//        System.out.println(truncated);
//        truncated = time.truncatedTo(ChronoUnit.DAYS);
//        System.out.println(truncated);

        //snippet 66

//        var date = LocalDate.of(2022, 5, 25);
//        var period = Period.ofDays(1);
//        var days = Duration.ofDays(1);
//        System.out.println(date.plus(period));
//        System.out.println(date.plus(days));

        //snippet 67

//        var now = Instant.now();
//        // do something time consuming
//        var later = Instant.now();

        //snippet 68

//        var duration = Duration.between(now, later);
//        System.out.println(duration.toMillis());

        //snippet 69

//        var date = LocalDate.of(2022, 5, 25);
//        var time = LocalTime.of(11, 55, 00);
//        var zone = ZoneId.of("US/Eastern");
//        var zonedDateTime = ZonedDateTime.of(date, time, zone);
//        var instant = zonedDateTime.toInstant();
//        System.out.println(zonedDateTime);
//        System.out.println(instant);

        //snippet 70

//        var date = LocalDate.of(2022, Month.MARCH, 13);
//        var time = LocalTime.of(1, 30);
//        var zone = ZoneId.of("US/Eastern");
//        var dateTime = ZonedDateTime.of(date, time, zone);
//        System.out.println(dateTime);
//        System.out.println(dateTime.getHour());
//        System.out.println(dateTime.getOffset());
//        dateTime = dateTime.plusHours(1);
//        System.out.println(dateTime);
//        System.out.println(dateTime.getHour());
//        System.out.println(dateTime.getOffset());

        //snippet 71

//        var date = LocalDate.of(2022, Month.NOVEMBER, 6);
//        var time = LocalTime.of(1, 30);
//        var zone = ZoneId.of("US/Eastern");
//        var dateTime = ZonedDateTime.of(date, time, zone);
//        System.out.println(dateTime);
//        dateTime = dateTime.plusHours(1);
//        System.out.println(dateTime);
//        dateTime = dateTime.plusHours(1);
//        System.out.println(dateTime);

        //snippet 72 - check oneException method above

        //snippet 73 - check twoExceptions method above

        //snippet 74 - check zooFriends method above

        //snippet 75 - check walk1,walk2,walk3,walk4 methods above

        //snippet 76

//        int[] data = new int[] {1, 2, 3};
//        walk1(data);
//        walk1(1,2,3);

        //snippet 77 - check inside method walk1 above

        //snippet 78 - check walkDog method above

//        walkDog(1); // 0
//        walkDog(1, 2); // 1
//        walkDog(1, 2, 3); // 2
//        walkDog(1, new int[] {4, 5});

        //snippet 79

//        walkDog(1, null);

        //snippet 80 - check Bird and Swan class

        //snippet 81 - check 2 fly methods above
    }
}
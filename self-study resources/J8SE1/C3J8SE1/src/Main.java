import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.time.*;
import java.time.format.*;
import java.util.List;

public class Main{
    //for snippet 37
    /*private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); //what is the problem ?
            }
    }*/


    //for snippet 38
    /*private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }*/

    public static void main(String[] args) {
        //snippet 1
        /*String s = "hello world";
        String s2 = "hello world";
        System.out.println(s == s2);*/

        //snippet 2
        /*String s = "hello world";
        String s2 = "hello" + " world";
        System.out.println(s == s2);*/

        //snippet 3
        /*String s = "hello world";
        String s2 = new String("hello world");
        System.out.println(s == s2);*/

        //snippet 4
        /*String s = "hello world";
        String s1 = "hell";
        String s2 = "o world";
        String s3 = s1 + s2;
        System.out.println(s == s3);*/

        //snippet 5
        /*String s = "hello world";
        String s1 = "hello";
        String s2 = s1 + " world";
        System.out.println(s == s2);*/

        //snippet 6
        /*String s = "hEllO";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());*/

        //snippet 7
        /*String s = "hello";
        System.out.println(s.startsWith("h"));
        System.out.println(s.endsWith("o"));
        System.out.println(s.startsWith("hell"));
        System.out.println(s.endsWith("llo"));*/

        //snippet 8
        /*String s = "hello";
        s = s.replace("ell", "ELL");
        System.out.println(s);
        String s2 = "world";
        s2 = s2.replace("w", "Z");
        System.out.println(s2);*/

        //snippet 9
        /*String s = " hello ";
        s = s.trim();
        s = s.replace("ell", "ELL");
        s = s.concat(" world");
        System.out.println(s);*/

        //snippet 10
        /*String s2 = " hello ";
        s2 = s2.trim().replace("ell", "ELL").concat(" world");
        System.out.println(s2);*/

        //snippet 11
        /*String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);*/

        //snippet 12
        /*StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);*/

        //snippet 13
        /*String[] arr = new String[2];
        Object[] obj = arr; //what is this called ?*/

        //snippet 14
        /*int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print (numbers[i] + " ");*/

        //snippet 15
        /*String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings) System.out.print(string + " ");*/

        //snippet 16
        /*int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));*/

        //snippet 17
        /*int[] numbers = new int[]{3,2,1};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3)); */

        //snippet 18
       /* int[][] arr = new int[12][12];
        int[][] arr2 = new int[2][3]; //{ {3}, {3} }
        int[][] arr3 = new int[2][]; //{2}
        arr3[0] = new int[3];
        arr3[1] = new int[2];*/

        //snippet 19
        /*int[][] arr = new int[2][];
        for(int[] d1: arr){
            for(int i: d1){
                System.out.println(i);
            }
        }*/

        //snippet 20
        /*int[][] arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        for(int[] d1: arr){
            for(int i: d1){
                System.out.println(i);
            }
        }*/

        //snippet 21
        /*String[][] arr = {{"hello", "world", "java"},
                {"hello", "world", "java"}};
        for(Object[] obj: arr){
            for(Object obj2: obj){
                System.out.println((String)obj2);
            }
        }
        int[][] arr2 = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
        for(int[] a: arr2){
            for(long i: a){
                System.out.println(i);
            }
        }*/
        //snippet 22
        /*ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        System.out.println(arrlist.get(0) instanceof Integer);
        System.out.println(arrlist.get(1) instanceof Integer);*/

        //snippet 23
        /*ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(0);
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(0);
        Integer i = 0;
        System.out.println(arrlist.remove(0));
        System.out.println(arrlist.remove(i));
        System.out.println(arrlist);*/


        //snippet 24
        /*ArrayList<Integer> arrlist = new ArrayList<>();
        Object[] arr = arrlist.toArray();*/

        //snippet 25
        /*ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        Integer[] a = new Integer[0];
        Integer[] arr = arrlist.toArray(a);
        System.out.println(a);
        System.out.println(arr);*/

        //snippet 26
        /*ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        Integer[] a = new Integer[2];
        Integer[] arr = arrlist.toArray(a);
        System.out.println(a);
        System.out.println(arr);*/

        //snippet 27
        /*ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(3);
        arrlist.add(1);
        arrlist.add(0);
        arrlist.add(-1);
        System.out.println(arrlist);
        Collections.sort(arrlist);
        System.out.println(arrlist);*/

        /*String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : list)
            System.out.print(b + " "); // new test
        list.remove(1);*/

        //snippet 28
        /*System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());*/

        //snippet 29 - make sure to explain each parameter usage
        /*LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);*/

        //snippet 30 - make sure to explain each parameter usage
        /*LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);*/

        //snippet 31
        /*LocalDateTime local1 = LocalDateTime.of(2015, 12, 2, 2, 15, 23);
        LocalDate locald1 = LocalDate.now();
        LocalTime localt1 = LocalTime.now();
        LocalDateTime local2 = LocalDateTime.of(locald1, localt1);
        System.out.println(local2);
        System.out.println(local1);*/

        //snippet 32
        /*LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);*/

        //snippet 33
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30); //what so special about this code ?
        System.out.println(dateTime);*/

        //snippet 34
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);*/

        //snippet 35 - what is wrong with this code ?
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);*/

        //snippet 36 - what is wrong with this code ?
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date = date.plusMinutes(1);*/

        //snippet 37 - also check the method above
        /*LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);*/

        //snippet 38
        /*LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period);*/

        //snippet 39
        /*Period wrong1 = Period.ofYears(1).ofWeeks(1); //check the class file*/

        //snippet 40
        /*Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(1);*/

        //snippet 41
        /*LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period));*/

        //snippet 42
        /*LocalDate date = LocalDate.of(2020, Month.APRIL, 20);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfMonth());*/


        //snippet 43
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);System.out.println(date
                .format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));*/

        //snippet 44
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));
        System.out.println(shortDateTime.format(time)); //what is wrong with this code ?*/

        //snippet 45
        /*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));*/

        //snippet 46
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);
        System.out.println(time);
    }
}
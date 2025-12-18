import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    //for snippet 1

    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //for snippet 2

    void fall1(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    //for snipept 3

    void fall2(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //for snippet 4

    void fall(String input) {
        System.out.println(input.toLowerCase());
    }

    //for snippet 20

    void explore() {
        try {
            fall3();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void fall3() {
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("hello world");
    }

    void seeAnimals() {
        System.out.println("hi");
    }

    //for snippet 24

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }

    void seeAnimal() {
        throw new AnimalsOutForAWalk();
    }

    //for snippet 25

    public void visitMonkeys() {
        try {
            throw new ExhibitClosed();
        } catch (ExhibitClosedForLunch e) {
            System.out.print("try back later");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        }
    }

    //for snippet 26

    public void visitMonkeys2() {
//        try {
//            seeAnimal();
//        } catch (ExhibitClosed e) {
//            System.out.print("not today");
//        } catch (ExhibitClosedForLunch e) {
//            System.out.print("try back later");
//        }
    }

    //for snippet 27

    public void visitSnakes() {
//        try {
//        } catch (IllegalArgumentException e) {
//        } catch (NumberFormatException e) {
//        }
    }

    //for snippet 36

    int goHome() {
        try {
            System.out.print("1");
            return -1;
        } catch (Exception e) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }

    //for snippet 38

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    //for snippet 39

    public void readFile2(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //for snippet 40

    public void readFile3(String file) throws IOException {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
        }
    }



    public static void main(String[] args) {
        //snippet 1 - check indexOf method above

        //snippet 2 - check fall1 method above

        //snippet 3 - check fall2 method above

        //snippet 4 - check fall3 method above

        //snippet 5

//        String[] animals = new String[0];
//        System.out.println(animals[0]);

        //snippet 6 - separate

//        throw new Exception();
//        throw new Exception("Ow! I fell.");
//        throw new RuntimeException();
//        throw new RuntimeException("Ow! I fell.");

        //snippet 7

//        var e = new RuntimeException();
//        throw e;

        //snippet 8

//        throw RuntimeException();

        //snippet 9

//        try {
//            throw new RuntimeException();
//            throw new ArrayIndexOutOfBoundsException();
//        } catch (Exception e) {}

        //snippet 10 - check Main2 class

        //snippet 11 - check Main2 class again

        //snippet 12 - check Main2 class again

        //snippet 13 - check Main2 class again

        //snippet 14 - check Main3 class

        //snippet 15 - check Main4 class

        //snippet 16 - check Main5 class

        //snippet 17 - check Frog class

        //snippet 18 - compile Frog class using ...

        //snippet 19

//        Integer.parseInt("abc");

        //snippet 20 - check explore and fall3 methods above

        //snippet 21

//        try
//            fall();
//        catch (Exception e)
//            System.out.println("get up");

        //snippet 22

//        try {
//            fall3();
//        }

        //snippet 23 - check all 2nd level classes

        //snipept 24 - check visitPorcupine method above

        //snippet 25 - check visitMonkey method above

        //snippet 26 - check visitMoney2 method above

        //snippet 27 - check visitSnakes method above

        //snippet 28

//        try {
//            System.out.println(Integer.parseInt(args[1]));
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Missing or invalid input");
//        } catch (NumberFormatException e) {
//            System.out.println("Missing or invalid input");
//        }

        //snippet 29

//        try {
//            System.out.println(Integer.parseInt(args[1]));
//        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//            System.out.println("Missing or invalid input");
//        }

        //snippet 30

//        try {
//            throw new IOException();
//        } catch (FileNotFoundException | IOException p) {}

        //snippet 31

//        try {
//            throw new IOException();
//        } catch (IOException e) {}

        //snippet 32

//        try {
//            fall();
//        } finally {
//            System.out.println("all better");
//        } catch (Exception e) {
//            System.out.println("get up");
//        }

        //snippet 33

//        try {
//            fall();
//        }

        //snippet 34

//        try {
//            fall();
//        } finally {
//            System.out.println("all better");
//        }

        //snippet 35

//        StringBuilder sb = new StringBuilder();
//        try {
//            sb.append("t");
//        } catch (Exception e) {
//            sb.append("c");
//        } finally {
//            sb.append("f");
//        }
//        sb.append("a");
//        System.out.print(sb.toString());

        //snippet 36 - check goHome method above

        //snippet 37

//        try {
//            System.exit(0);
//        } finally {
//            System.out.print("Never going to get here");
//        }

        //snippet 38 - check readFile method above

        //snippet 39 - check readFile2 method above

        //snippet 40 - check readFile3 method above

        //snippet 41 - check MyFileClass class

        //snippet 42

//        try (MyFileClass is = new MyFileClass(1),
//                os = new MyFileClass(2)) {
//        }
//        try (MyFileClass ab = new MyFileClass(1),
//                MyFileClass cd = new MyFileClass(2)) {
//        }

        //snippet 43

//        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) {
//            // Process file
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e); //explain why do we need these clauses ?
//        }

        //snippet 44

//        try (Scanner s = new Scanner(System.in)) {
//            s.nextLine();
//        } catch(Exception e) {
//            s.nextInt();
//        } finally {
//            s.nextInt();
//        }

        //snippet 45

//        try (MyFileClass bookReader = new MyFileClass(1);
//             MyFileClass movieReader = new MyFileClass(2)) {
//            System.out.println("Try Block");
//            throw new RuntimeException();
//        } catch (Exception e) {
//            System.out.println("Catch Block");
//        } finally {
//            System.out.println("Finally Block");
//        }

        //snippet 46

//        final var bookReader = new MyFileClass(4);
//        MyFileClass movieReader = new MyFileClass(5);
//        try (bookReader;
//             var tvReader = new MyFileClass(6);
//             movieReader) {
//            System.out.println("Try Block");
//        } finally {
//            System.out.println("Finally Block");
//        }

        //snippet 47

//        var writer = Files.newBufferedWriter("helloworld.txt");
//        try (writer) {
//            writer.append("Welcome to the zoo!");
//        } catch (IOException e) {
//            throw new RuntimeException(e); //?
//        }
//        writer = null;

        //snippet 48 - check TurkeyCage class

        //snippet 49 - check JammedTurkeyCage class

        //snippet 50

//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new IllegalStateException("Turkeys ran off");
//        } catch (IllegalStateException e) {
//            System.out.println("Caught: " + e.getMessage());
//            for (Throwable t: e.getSuppressed())
//                System.out.println("Suppressed: "+t.getMessage());
//        }

        //snippet 51

//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new RuntimeException("Turkeys ran off");
//        } catch (IllegalStateException e) {
//            System.out.println("caught: " + e.getMessage());
//        }

        //snippet 52

//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new IllegalStateException("Turkeys ran off");
//        } finally {
//            throw new RuntimeException("and we couldn't find them");
//        }

        //snippet 53

//        double d = 1234.567;
//        NumberFormat f1 = new DecimalFormat("###,###,###.0");
//        System.out.println(f1.format(d));
//
//        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
//        System.out.println(f2.format(d));
//
//        NumberFormat f3 = new DecimalFormat("Your Balance $#,###,###.##");
//        System.out.println(f3.format(d));

        //snippet 54

//        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getMonth());
//        System.out.println(date.getYear());
//        System.out.println(date.getDayOfYear());

        //snippet 55

//        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dt = LocalDateTime.of(date, time);
//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        //snippet 56
//        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dt = LocalDateTime.of(date, time);
//        date.format(DateTimeFormatter.ISO_LOCAL_TIME);
//        time.format(DateTimeFormatter.ISO_LOCAL_DATE);

        //snippet 57
//        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dt = LocalDateTime.of(date, time);
//        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
//        System.out.println(dt.format(f));

        //snippet 58

//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//        System.out.println(dt.format(formatter1));
//        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
//        System.out.println(dt.format(formatter2));
//        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3));

        //snippet 59

//        var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//        System.out.println(dateTime.format(formatter));
//        System.out.println(formatter.format(dateTime));

        //snippet 60

//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
//        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
//        System.out.println(dt.format(f1) + "at" + dt.format(f2));

        //snippet 61

//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
//        System.out.println(dt.format(f));

        //snippet 62

//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
//        System.out.println(dt.format(g1));

        //snippet 63

//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
//        System.out.println(dt.format(g2));

        //snippet 64

//        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
//        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
//        System.out.println(dt.format(g3));

        //snippet 65

//        DateTimeFormatter.ofPattern("The time is hh:mm");

        //snippet 66

//        DateTimeFormatter.ofPattern("'Time is: hh:mm: ");
    }
}
class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}
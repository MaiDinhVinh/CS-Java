import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main{

    //for snippet 6

    public static void io() {
        var file = new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println(" " + subfile.getName());
                } } } }

    //for snippet 7

    public static void nio() throws IOException {
        var path = Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
        if (Files.exists(path)) {
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Parent Path: " + path.getParent());
            if (Files.isRegularFile(path)) {
                System.out.println("Size: " + Files.size(path));
                System.out.println("Last Modified: "
                        + Files.getLastModifiedTime(path));
            } else {
                try (Stream<Path> stream = Files.list(path)) {
                    stream.forEach(p -> {
                        for(int i = 0; i < p.getNameCount(); i++) System.out.println(" " + p.getName(i));
                    });
                } } } }

    //for snippet 9

    void copy(Path source, Path target) throws IOException {
        Files.move(source, target,
                LinkOption.NOFOLLOW_LINKS,
                StandardCopyOption.ATOMIC_MOVE);
    }

    //for snippet 16

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println(" Root is: " + path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null)
            System.out.println(" Current parent is: " + currentParent);
        System.out.println();
    }

    //for snippet 28

//    public void copyPath(Path source, Path target) {
//        try {
//            Files.copy(source, target);
//            if(Files.isDirectory(source))
//                try (Stream<Path> s = Files.list(source)) {
//                    s.forEach(p -> copyPath(p,
//                            target.resolve(p.getFileName())));
//                }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//    }

    //for snippet 42

    void copyStream1(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    //for snippet 43

    void copyStream2(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    //for snippet 44

    void copyStream3(InputStream in, OutputStream out) throws IOException {
        int batchSize = 1024;
        var buffer = new byte[batchSize];
        int lengthRead;
        while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {
            out.write(buffer, 0, lengthRead);
            out.flush();
        }
    }

    //for snippet 45

    void copyTextFile(File src, File dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src));
             var writer = new BufferedWriter(new FileWriter(dest))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    //for snippet 46

    void copyTextFile2(File src, File dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src));
             var writer = new PrintWriter(new FileWriter(dest))) {
            String line = null;
            while ((line = reader.readLine()) != null)
                writer.println(line);
        }
    }

    //for snippet 48

    private void copyPathAsString(Path input, Path output) throws IOException {
        String string = Files.readString(input);
        Files.writeString(output, string);
    }

    //for snippet 49

    private void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        Files.write(output, bytes);
    }

    //for snippet 50

    private void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        Files.write(output, lines);
    }

    //for snippet 51

    private void readLazily(Path path) throws IOException {
        try (Stream<String> s = Files.lines(path)) {
            s.forEach(System.out::println);
        }
    }

    //for snippet 55

    private void copyPath(Path input, Path output) throws IOException {
        try (var reader = Files.newBufferedReader(input);
             var writer = Files.newBufferedWriter(output)) {
            String line = null;while ((line = reader.readLine()) != null)
                writer.write(line);
            writer.newLine();
        }
    }

    //for snippet 60

    static void saveToFile(List<Gorilla> gorillas, File dataFile)
            throws IOException {
        try (var out = new ObjectOutputStream(
            new BufferedOutputStream(
                    new FileOutputStream(dataFile)))) {
        for (Gorilla gorilla : gorillas)
            out.writeObject(gorilla);
        }
    }

    //for snippet 61

    static List<Gorilla> readFromFile(File dataFile) throws IOException,
            ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla g)
                    gorillas.add(g);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return gorillas;
    }

    //for snippet 64

    static void saveToFile2(List<Chimpanzee> gorillas, File dataFile)
            throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Chimpanzee gorilla : gorillas)
                out.writeObject(gorilla);
        }
    }

    static List<Chimpanzee> readFromFile2(File dataFile) throws IOException,
            ClassNotFoundException {
        var gorillas = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee g)
                    gorillas.add(g);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return gorillas;
    }

    //for snippet 76

    public static void readData(InputStream is) throws IOException {
        System.out.print((char) is.read());
        if (is.markSupported()) {
            is.mark(100);
            System.out.print((char) is.read());
            System.out.print((char) is.read());
            is.reset();
        }
        System.out.print((char) is.read());
        System.out.print((char) is.read());
        System.out.print((char) is.read());
    }

    //for snippet 82

    private static long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    public static long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(path -> getSize(path))
                    .sum();
        }
    }

    //for snippet 84

    public static long getPathSize2(Path source) throws IOException {
        try (var s = Files.walk(source, 10, FileVisitOption.FOLLOW_LINKS)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(path -> getSize(path))
                    .sum();
        }
    }

    public static void main(String[] args) {

        //snippet 1

//        System.out.print(System.getProperty("file.separator"));

        //snippet 2

//        File zooFile1 = new File
//                ("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
//        File zooFile2 = new File
//                ("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/",
//                        "data/stripes.txt");
//        File parent = new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/");
//        File zooFile3 = new File(parent, "data/stripes.txt");
//        System.out.println(zooFile1.exists());

        //snippet 3

//        Path zooPath1 = Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
//        Path zooPath2 = Path.of
//                ("/Users", "ducksabervn", "DATA", "hoc hanh", "hoc them", "comp sci", "CS-Java", "OCP17", "JSE17C14", "home", "tiger", "data", "stripes.txt");
//        Path zooPath3 = Paths.get
//                ("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
//        Path zooPath4 = Paths.get
//                ("/Users", "ducksabervn", "DATA", "hoc hanh", "hoc them", "comp sci", "CS-Java", "OCP17", "JSE17C14", "home", "tiger", "data", "stripes.txt");
//        System.out.println(Files.exists(zooPath1));

        //snippet 4

//        File file = new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/");
//        Path nowPath = file.toPath();
//        File backToFile = nowPath.toFile();

        //snippet 5

//        Path zooPath1 = FileSystems.getDefault()
//                .getPath("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/");
//        Path zooPath2 = FileSystems.getDefault()
//                .getPath("/Users", "ducksabervn", "DATA", "hoc hanh", "hoc them", "comp sci", "CS-Java", "OCP17", "JSE17C14", "home", "tiger", "data", "stripes.txt");

        //snippet 6 - check method io above (also remove the file to test with directory too)

//        io();

        //snippet 7 - check method nio above (also remove the file to test with directory too)

//        try {
//            nio();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 8

//        Path path = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
//        boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
//        System.out.println(exists);

        //snippet 9 - check copy method above

        //snippet 10

//        Path p = Path.of("whale");
//        p.resolve("krill");
//        System.out.println(p);

        //snippet 11

//        System.out.println(Path.of("/zoo/../home")
//                .getParent().normalize().toAbsolutePath());

        //snippet 12

//        Path path = Paths.get("/land/hippo/harry.happy");
//        System.out.println("The Path Name is: " + path);
//        for(int i=0; i<path.getNameCount(); i++)
//            System.out.println(" Element " + i + " is: " + path.getName(i));

        //snippet 13

//        var p = Path.of("/");
//        System.out.print(p.getNameCount());
//        System.out.print(p.getName(0));

        //snippet 14

//        var p = Paths.get("/mammal/omnivore/raccoon.image");
//        System.out.println("Path is: " + p);
//        for (int i = 0; i < p.getNameCount(); i++) {
//            System.out.println(" Element " + i + " is: " + p.getName(i));
//        }
//        System.out.println();
//        System.out.println("subpath(0,3): " + p.subpath(0, 3));
//        System.out.println("subpath(1,2): " + p.subpath(1, 2));
//        System.out.println("subpath(1,3): " + p.subpath(1, 3));

        //snippet 15

//        var p = Paths.get("/mammal/omnivore/raccoon.image");
//        var q = p.subpath(0, 4);
//        var x = p.subpath(1, 1);

        //snippet 16 - check printPathInformation method above too

//        printPathInformation(Path.of("zoo"));
//        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
//        printPathInformation(Path.of("./armadillo/../shells.txt"));

        //snippet 17

//        Path path1 = Path.of("/cats/../panther");
//        Path path2 = Path.of("food");
//        System.out.println(path1.resolve(path2));

        //snippet 18

//        Path path3 = Path.of("/turkey/food");
//        System.out.println(path3.resolve("/tiger/cage"));

        //snippet 19

//        var path1 = Path.of("fish.txt");
//        var path2 = Path.of("friendly/birds.txt");
//        System.out.println(path1.relativize(path2));
//        System.out.println(path2.relativize(path1));

        //snippet 20

//        Path path3 = Paths.get("E:\\habitat");
//        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
//        System.out.println(path3.relativize(path4));
//        System.out.println(path4.relativize(path3));

        //snippet 21

//        Path path1 = Paths.get("/primate/chimpanzee");
//        Path path2 = Paths.get("bananas.txt");
//        path1.relativize(path2);

        //snippet 22

//        Path path3 = Paths.get("C:\\primate\\chimpanzee");
//        Path path4 = Paths.get("D:\\storage\\bananas.txt");
//        path3.relativize(path4);

        //snippet 23

//        var p1 = Path.of("./armadillo/../shells.txt");
//        System.out.println(p1.normalize());
//
//        var p2 = Path.of("/cats/../panther/food");
//        System.out.println(p2.normalize());
//
//        var p3 = Path.of("../../fish.txt");
//        System.out.println(p3.normalize());

        //snippet 24

//        var p1 = Paths.get("/pony/../weather.txt");
//        var p2 = Paths.get("/weather.txt");
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.normalize().equals(p2.normalize()));

        //snippet 25

//        try {
//            System.out.println(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/zebra/stripes.txt").toRealPath());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 26

//        try {
//            Files.createDirectory(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/dir1"));
//            Files.createDirectories(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/dir2"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 27 - run with correct sequence !

//        try {
//            Files.copy(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt"),
//                    Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/dir3/hello.txt"));
//
//            Files.copy(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/dir3/"),
//                    Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/dir4/"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 28 - check the copyPath method above

        //snippet 29

//        try {
//            Files.copy(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt"),
//                    Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/movies.txt"),
//                    StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 30

//        try (var is = new FileInputStream("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/source-data.txt")) {
//            Files.copy(is, Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/hello.txt"));
//            Files.copy(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/source-data.txt"), System.out);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 31

//        var file = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/food.txt");
//        var directory = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/enclosure/");
//        try {
//            Files.copy(file, directory, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 32

//        var file = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/food.txt");
//        var directory = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/enclosure/food.txt");
//        try {
//            Files.copy(file, directory);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 33

//        try {
//            Files.move(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/test1"),
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/test1_renamed"));
//            Files.move(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/test2/test2.txt"),
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/test2_renamed/test2_renamed.txt"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 34

//        try {
//            Files.move(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/test3/test3.txt"),
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/test3_renamed/test3_renamed.txt"),
//                    StandardCopyOption.ATOMIC_MOVE);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 35

//        try {
//            System.out.println(Files.deleteIfExists(Paths.get("/pigeon")));
//            Files.delete(Paths.get("/vulture/feathers.txt"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 36

//        try {
//            System.out.println(Files.isSameFile(
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/animal/cobra"),
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/animal/snake")));
//            System.out.println(Files.isSameFile(
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/animal/monkey/ears.txt"),
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/animal/wolf/ears.txt")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 37

//        try { //explain why +1 ?
//            System.out.println(Files.mismatch(
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/animal/wolf/wolf.txt"),
//                    Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/animal/monkey/monkey.txt")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        /////////////////////////////////
        /// SECTION 2
        /////////////////////////////////

        //snippet 38

//        Charset usAsciiCharset = Charset.forName("US-ASCII");
//        Charset utf8Charset = Charset.forName("UTF-8");
//        Charset utf16Charset = Charset.forName("UTF-16");

        //snippet 39

//        try (var br = new BufferedReader(new FileReader("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/zoo-data.txt"))) {
//            System.out.println(br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 40

//        try (var ois = new ObjectInputStream(
//                new BufferedInputStream(
//                        new FileInputStream("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/zoo-data.txt")))) {
//            System.out.print(ois.readObject());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 41

//        new BufferedInputStream(new FileReader("z.txt"));
//        new BufferedWriter(new FileOutputStream("z.txt"));
//        new ObjectInputStream(
//                new FileOutputStream("z.txt"));
//        new BufferedInputStream(new InputStream());

        //snippet 42 - check copyStream1 method above

        //snippet 43 - check copyStream2 method above

        //snippet 44 - check copyStream3 method above

        //snippet 45 - check copyTextFile method above

        //snippet 46 - check copyTextFile2 method above

        //snippet 47

//        System.out.println(System.getProperty("line.separator"));
//        System.out.println(System.lineSeparator());

        //snippet 48 - check copyPathAsString method above

        //snippet 49 - check copyPathAsBytes method above

        //snippet 50 - check copyPathAsLines method above

        //snippet 51 - check readLazily method above

        //snipept 52 - check the sharks.log file too

//        try (var s = Files.lines(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/sharks.log"))) {
//            s.filter(f -> f.startsWith("WARN:"))
//                    .map(f -> f.substring(5))
//                    .forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 53

//        try {
//            Files.readAllLines(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/sharks.log")).forEach(System.out::println);
//            Files.lines(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/sharks.log")).forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 54

//        Files.readAllLines(Paths.get("birds.txt"))
//                .filter(s -> s.length()> 2)
//                .forEach(System.out::println);

        //snippet 55 - check copyPath method above

        //snippet 56 - check Gorilla class

        //snippet 57 - check Cat class

        //snippet 58 - check Cat2 class

        //snippet 59 - check SeriRecord record

        //snippet 60 - check saveToFile method above

        //snippet 61 - check readFromFile method above

        //snippet 62

//        var gorillas = new ArrayList<Gorilla>();
//        gorillas.add(new Gorilla("Grodd", 5, false));
//        gorillas.add(new Gorilla("Ishmael", 8, true));
//        File dataFile = new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/gorilla.data");
//        try {
//            saveToFile(gorillas, dataFile);
//            var gorillasFromDisk = readFromFile(dataFile);
//            System.out.print(gorillasFromDisk);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 63 - check Chimpanzee class

        //snippet 64

//        var chimpanzees = new ArrayList<Chimpanzee>();
//        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
//        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
//        File dataFile = new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/chimpanzee.data");
//
//        try{
//            saveToFile2(chimpanzees, dataFile);
//            var chimpanzeesFromDisk = readFromFile2(dataFile);
//            System.out.println(chimpanzeesFromDisk);
//        }catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 65 - check BabyChimpanzee class

        //snippet 66

//        try (var in = new FileInputStream("zoo.txt")) {
//            System.out.println("Found file!");
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 67

//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        String userInput = null;
//        try {
//            userInput = reader.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("You entered: " + userInput);

        //snippet 68

//        try (var out = System.out) {}
//        System.out.println("Hello");

        //snippet 69

//        try (var err = System.err) {}
//        System.err.println("Hello");

        //snippet 70

//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        try (reader) {} catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            String data = reader.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 71

//        Console c = new Console();

        //snippet 72 - check Main2 too

//        Console console = System.console();
//        if (console != null) {
//            String userInput = console.readLine();
//            console.writer().println("You entered: " + userInput);
//        } else {
//            System.err.println("Console not available");
//        }

        //snippet 73 - check Main3 class

        //snippet 74 - check Main4 class

        //snippet 75 - check Main5 class

        //snippet 76 - check readData method above too

//        try {
//            readData(new FileInputStream(new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/inp.txt")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 77

//        try(FileInputStream fs = new FileInputStream(new File("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/inp2.txt"));){
//            System.out.print ((char)fs.read());
//            fs.skip(2);
//            fs.read();
//            System.out.print((char)fs.read());
//            System.out.print((char)fs.read());
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        //snippet 78

//        System.out.println(Files.isDirectory(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/zebra")));
//        System.out.println(Files.isSymbolicLink(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/zebra")));
//        System.out.println(Files.isRegularFile(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/zebra")));

        //snippet 79

//        try {
//            System.out.println(Files.isHidden(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/Main2.class")));
//            System.out.println(Files.isReadable(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/Main2.class")));
//            System.out.println(Files.isWritable(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/Main2.class")));
//            System.out.println(Files.isExecutable(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/Main2.class")));
//
//            System.out.println(Files.isExecutable(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/Main2.class")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 80

//        var path = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/inp.txt");
//        BasicFileAttributes data = null;
//        try {
//            data = Files.readAttributes(path,
//                    BasicFileAttributes.class);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Is a directory? " + data.isDirectory());
//        System.out.println("Is a regular file? " + data.isRegularFile());
//        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
//        System.out.println("Size (in bytes): " + data.size());
//        System.out.println("Last modified: " + data.lastModifiedTime());

        //snippet 81

//        var path = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/src/inp.txt");
//        BasicFileAttributeView view = Files.getFileAttributeView(path,
//                BasicFileAttributeView.class);
//        BasicFileAttributes attributes = null;
//        try {
//            attributes = view.readAttributes();
//            System.out.println(attributes.lastModifiedTime());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        FileTime lastModifiedTime = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
//        try {
//            view.setTimes(lastModifiedTime, null, null);
//            attributes = view.readAttributes();
//            System.out.println(attributes.lastModifiedTime());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 82 - check method getSize and getPathSize above too

//        try {
//            System.out.println(getPathSize(Path.of("/Users/ducksabervn/DATA")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 83

//        try {
//            var size = getPathSize(Path.of("/Users/ducksabervn/DATA"));
//            System.out.format("Total Size: %.2f megabytes", (size/1000000.0));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 84 - check getPathSize2 method above too

//        try {
//            System.out.println(getPathSize2(Path.of("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home2")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //snippet 85

//        Path path = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java");
//        long minSize = 1_000;
//        try (var s = Files.find(path, 10,
//                (p, a) -> a.isRegularFile()
//                        && p.toString().endsWith(".java")
//                        && a.size() > minSize)) {
//            s.forEach(System.out::println);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
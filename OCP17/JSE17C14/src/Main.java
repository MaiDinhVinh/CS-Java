import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
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

    public void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if(Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source)) {
                    s.forEach(p -> copyPath(p,
                            target.resolve(p.getFileName())));
                }
        } catch(IOException e) {
            e.printStackTrace();
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
//        Path zooPath2 = Path.of("/Users", "ducksabervn", "DATA", "hoc hanh", "hoc them", "comp sci", "CS-Java", "OCP17", "JSE17C14", "home", "tiger", "data", "stripes.txt");
//        Path zooPath3 = Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/data/stripes.txt");
//        Path zooPath4 = Paths.get("/Users", "ducksabervn", "DATA", "hoc hanh", "hoc them", "comp sci", "CS-Java", "OCP17", "JSE17C14", "home", "tiger", "data", "stripes.txt");
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

        //snippet 7 - check method nio above (also remove the file to test with directory too)

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

//        System.out.println(Path.of("/zoo/../home").getParent().normalize().toAbsolutePath());

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
//        System.out.println(p1.normalize().equals(p2.normalize()));\

        //snippet 25

//        try {
//            System.out.println(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/zebra/data/stripes.txt").toRealPath());
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
//            Files.copy(Paths.get("/Users/ducksabervn/DATA/hoc hanh/hoc them/comp sci/CS-Java/OCP17/JSE17C14/home/tiger/zebra/data/stripes.txt"),
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
//            Files.copy(file, directory);
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
    }
}
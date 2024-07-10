package HW;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class RunDriver {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Path read = Paths.get("src/HW/person_list.txt");
        String read_Line = null;
        String separation = "\t";
        String[] final_separation = null;
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){

            br.readLine(); //ignore first line, search on gg
            while((read_Line = br.readLine()) != null){
                final_separation = read_Line.split(separation);
                if(final_separation.length == 5){
                    personList.add(new Person(final_separation[0], final_separation[1],
                            final_separation[2], Integer.parseInt(final_separation[3]),
                            final_separation[4]));
                } else if(final_separation.length > 5){
                    /*
                      This line of code is basically handling
                      the case where country name has more than 2 strings
                     */
                    String country_name = final_separation[4] + final_separation[5];
                    personList.add(new Person(final_separation[0], final_separation[1],
                            final_separation[2], Integer.parseInt(final_separation[3]),
                            country_name));
                }
            }

        } catch(Exception e){
            System.out.println("Exception found! " + e.getStackTrace());
        }


        //sorting by firstName - lambda expression
        Comparator<Person> firstNameComparsion = (p1, p2) -> {
            return p1.getFirstName().compareTo(p2.getFirstName());
        };

        Collections.sort(personList, firstNameComparsion);


        //sorting by lastName (descending) - lambda expression
        Comparator<Person> lastNameDescendComparision = (p1, p2) -> {
            return -(p1.getLastName().compareTo(p2.getLastName()));
        };

        Collections.sort(personList, lastNameDescendComparision);

        //sorting by age (descending) - lambda expression
        Comparator<Person> ageDescendingComparator = (p1, p2) -> {
            return -(p1.getAge() - p2.getAge());
        };

        Collections.sort(personList, ageDescendingComparator);

        //print out all persons born after 1968
        Object[] after_1968 = personList.stream().filter(p_1968 -> p_1968.getBirthYear() > 1968).toArray();

        //print out all persons from Vietnam
        Object[] from_vietnam = personList.stream().filter(p_vietnam -> p_vietnam.getCountry().equals("Vietnam")).toArray();

        //print out all persons older than 40
        Object[] older_than_40 = personList.stream().filter(p_more_40 -> p_more_40.getAge() > 40).toArray();

        //print out all persons who have the longest lastName
        Collections.sort(personList, (p_longest_ln1, p_longest_ln2) -> {
            return -(p_longest_ln1.getLastName().length() - p_longest_ln2.getLastName().length());
        });

        int largest_length = personList.get(0).getLastName().length(); //largest lastName length

        Object[] all_largest_fn = personList.stream().
                filter(p_largest_ln -> p_largest_ln.getLastName().length() == largest_length).toArray();

        for(Object i: all_largest_fn){
            System.out.println(i);
        }

    }
}

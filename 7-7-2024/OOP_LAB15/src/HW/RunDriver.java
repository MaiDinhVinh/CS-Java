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
import java.util.OptionalDouble;

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
                personList.add(new Person(final_separation[0], final_separation[1],
                            final_separation[2], Integer.parseInt(final_separation[3]),
                            final_separation[4]));
//                if(final_separation.length == 5){
//                    personList.add(new Person(final_separation[0], final_separation[1],
//                            final_separation[2], Integer.parseInt(final_separation[3]),
//                            final_separation[4]));
//                } else if(final_separation.length > 5){
//                    /*
//                      This line of code is basically handling
//                      the case where country name has more than 2 strings
//                     */
//                    String country_name = final_separation[4] + final_separation[5];
//                    personList.add(new Person(final_separation[0], final_separation[1],
//                            final_separation[2], Integer.parseInt(final_separation[3]),
//                            country_name));
//                }

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
        Object[] after_1968 = personList.stream()
                .filter(p_1968 -> p_1968.getBirthYear() > 1968)
                .toArray();

        //print out all persons from Vietnam
        Object[] from_vietnam = personList.stream()
                .filter(p_vietnam -> p_vietnam.getCountry().equals("Vietnam"))
                .toArray();

        //print out all persons older than 40
        Object[] older_than_40 = personList.stream()
                .filter(p_more_40 -> p_more_40.getAge() > 40)
                .toArray();

        //print out all persons who have the longest lastName
        Collections.sort(personList, (p_longest_ln1, p_longest_ln2) -> {
            return -(p_longest_ln1.getLastName().length() - p_longest_ln2.getLastName().length());
        });

        int largest_length = personList.get(0).getLastName().length(); //largest lastName length

        Object[] all_largest_fn = personList.stream()
                .filter(p_largest_ln -> p_largest_ln.getLastName().length() == largest_length)
                .toArray();

        //print out all persons less than 30 years old and from Japan
        Object[] less_30_Japan = personList.stream().filter(p_30_Japan -> {
            return p_30_Japan.getAge() < 30 && p_30_Japan.getCountry().equals("Japan");
        }).toArray();

        //print out the youngest person and oldest person
        Collections.sort(personList, (pyoung1, pyoung2) -> {
            return pyoung1.getAge() - pyoung2.getAge();
        });

        int youngest_age = personList.get(0).getAge();
        int oldest_age = personList.get(personList.size() -  1).getAge();

        Object[] youngest_person = personList.stream().filter(p_youngest -> p_youngest.getAge() == youngest_age).toArray();
        Object[] oldest_person = personList.stream().filter(p_oldest -> p_oldest.getAge() == oldest_age).toArray();

        //Calculate total age of all males
        int total_age_male = personList.stream()
                .filter(ponlymale -> ponlymale.getGender().equals("Male"))
                .mapToInt(pmale -> pmale.getAge()).sum();

        //calculate total age of all females from US
        int total_us_female_age = personList.stream()
                .filter(ponlyfemale -> ponlyfemale.getGender().equals("Female") && ponlyfemale.getCountry().equals("United States"))
                .mapToInt(pusfemale -> pusfemale.getAge()).sum();

        //calculate average age of persons from VN
        OptionalDouble average_VN_age = personList.stream().
                filter(ponlyVN -> ponlyVN.getCountry().equals("Vietnam")).mapToDouble(pVN -> pVN.getAge()).average();
        double final_VN_age = average_VN_age.isPresent() ? average_VN_age.getAsDouble() : 0.0d;

        //Among Vietnam, Thailand and Japan, which country has the maximum total age of all males ?
        int total_male_age_VN = personList.stream()
                .filter(ponlymale -> ponlymale.getGender().equals("Male") && ponlymale.getCountry().equals("Vietnam"))
                .mapToInt(pmale -> pmale.getAge()).sum();


        int total_male_age_Thailand = personList.stream()
                .filter(ponlymale -> ponlymale.getGender().equals("Male") && ponlymale.getCountry().equals("Thailand"))
                .mapToInt(pmale -> pmale.getAge()).sum();


        int total_male_age_Japan = personList.stream()
                .filter(ponlymale -> ponlymale.getGender().equals("Male") && ponlymale.getCountry().equals("Japan"))
                .mapToInt(pmale -> pmale.getAge()).sum();


        String largest_country_total_age = null;

        if(total_male_age_VN > total_male_age_Japan && total_male_age_VN > total_male_age_Thailand){
            largest_country_total_age = "Vietnam";
        }

        if(total_male_age_Thailand > total_male_age_VN && total_male_age_Thailand > total_male_age_Japan){
            largest_country_total_age = "Thailand";
        }

        if(total_male_age_Japan > total_male_age_VN && total_male_age_Japan > total_male_age_Thailand){
            largest_country_total_age = "Japan";
        }

        //System.out.println("Country with largest total age of males is: " + largest_country_total_age);

        //Among United States, United Kingdom, which country has the minimum total age of all females ?
        int total_female_US = personList.stream()
                .filter(ponlyFemale -> ponlyFemale.getGender().equals("Female") && ponlyFemale.getCountry().equals("United States"))
                .mapToInt(pfemale -> pfemale.getAge()).sum();


        int total_female_UK = personList.stream()
                .filter(ponlyFemale -> ponlyFemale.getGender().equals("Female") && ponlyFemale.getCountry()
                        .equals("United Kingdom")).mapToInt(pfemale -> pfemale.getAge()).sum();


        String smallest_total_age_country = null;
        if(total_female_US < total_female_UK){
            smallest_total_age_country = "US";
        } else{
            smallest_total_age_country = "UK";
        }

        //System.out.println("Country with smallest total age is: " + smallest_total_age_country);

    }
}

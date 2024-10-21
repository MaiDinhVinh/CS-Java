import java.time.LocalDate;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;
import java.util.OptionalDouble;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String country;

    public Person(String firstName, String lastName,
                  String gender, int birthYear,
                  String country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.country = country;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getGender(){
        return this.gender;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public String getCountry(){
        return this.country;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public int getAge(){
        return LocalDate.now().getYear() - this.birthYear;
    }

    @Override
    public String toString(){
        System.out.format("Name: %s, %s |Gender: %s |Birthyear %d |Age: %d |Country: %s",
                this.firstName, this.lastName, this.gender, this.birthYear, this.getAge(),
                this.country);
        return "\n";
    }

    public static void main(String[] args) {
        Path input = Paths.get("src/person_list.txt");
        List<Person> finalList = new ArrayList<>();
        try(BufferedReader bfr =
                    Files.newBufferedReader(input, StandardCharsets.UTF_8)){
            String read = "";
            String[] splitedData = null;
            bfr.readLine(); //ignore first line
            while((read = bfr.readLine()) != null){
                splitedData = read.split("\t");
                finalList.add(new Person(
                        splitedData[0], splitedData[1], splitedData[2],
                        Integer.parseInt(splitedData[3]), splitedData[4]
                ));
            }
        }catch(IOException e){
            System.out.println("Can't read the file !");
        }catch(Exception e){
            System.out.println("Exception encountered !");
        }

        Collections.sort(finalList, (p1, p2) -> {
            return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
        }); //sort by first name in Ascending order

        Collections.sort(finalList, (p1, p2) -> {
            return p2.getLastName().compareToIgnoreCase(p1.getLastName());
        }); //sort by last name in Descending order

        Collections.sort(finalList, (p1, p2) -> {
           return p2.getAge()>p1.getAge()?1:(p2.getAge()==p1.getAge()?0:-1);
        });

        Object[] sortedListAsBirth = finalList.stream()
                .filter((p) -> p.getBirthYear() > 1968).toArray();
        Object[] sortedListAsVietnam = finalList.stream()
                .filter((p) -> p.getCountry().equals("Vietnam")).toArray();
        Object[] sortedListAsOlderThan40 = finalList.stream()
                .filter((p) -> p.getAge() > 40).toArray();
        int tempMax = finalList.get(0).getLastName().length();
        for(Person person: finalList){
            if(person.getLastName().length() > tempMax) tempMax =
                    person.getLastName().length();
        }
        final int maxLastNameLength = tempMax;
        Object[] peopleWithMaxLastNameLength = finalList.stream()
                .filter((p) -> p.getLastName().length() == maxLastNameLength).toArray();
        Object[] lessThan30AndFromJapan = finalList.stream()
                .filter((p) -> p.getAge() < 30 && p.getCountry().equalsIgnoreCase("Japan"))
                .toArray();
       Collections.sort(finalList, (p1, p2) ->
               p1.getAge()>p2.getAge()?1:(p1.getAge()==p2.getAge()?0:-1)); //print youngest at index 0
       Collections.sort(finalList, (p1, p2) ->
               p2.getAge()>p1.getAge()?1:(p2.getAge()==p1.getAge()?0:-1)); //print oldest at index = 0

        int tempOldest = finalList.get(0).getAge();
        for(Person person: finalList){
            if(person.getAge() > tempOldest){
                tempOldest = person.getAge();
            }
        }

        int finalOldest = tempOldest;
        Object[] oldestPerson = finalList.stream()
                .filter((p) -> p.getAge() == finalOldest).toArray();
        int sumOfMaleAge = finalList.stream()
                .filter((p) -> p.getGender().equalsIgnoreCase("male"))
                .mapToInt((p) -> p.getAge()).sum();

        int sumOfFemaleAgeFromUS = finalList.stream()
                .filter((p) -> p.getGender().equalsIgnoreCase("female")
                && p.getCountry().equalsIgnoreCase("United States"))
                .mapToInt((p) -> p.getAge()).sum();
        OptionalDouble averageOfAgesFromVN = finalList.stream()
                .filter((p) -> p.getCountry().equalsIgnoreCase("Vietnam"))
                .mapToDouble((p) -> p.getAge()).average();
        double vnAverageAge = averageOfAgesFromVN.isPresent()?averageOfAgesFromVN.getAsDouble():0.0;

        int sumAgesFromVN = finalList.stream().filter((p) -> p.getCountry().
                equalsIgnoreCase("vietnam") &&
                p.getGender().equalsIgnoreCase("male")).mapToInt((p) -> p.getAge()).sum();

        int sumAgesFromThailand = finalList.stream().filter((p) -> p.getCountry().
                equalsIgnoreCase("thailand") &&
                p.getGender().equalsIgnoreCase("male")).mapToInt((p) -> p.getAge()).sum();
        int sumAgesFromJapan = finalList.stream().filter((p) -> p.getCountry().
                equalsIgnoreCase("japan") &&
                p.getGender().equalsIgnoreCase("male")).mapToInt((p) -> p.getAge()).sum();
        if(sumAgesFromVN > sumAgesFromThailand && sumAgesFromVN > sumAgesFromJapan){
            System.out.println(sumAgesFromVN);
        } else if(sumAgesFromThailand > sumAgesFromVN && sumAgesFromThailand > sumAgesFromJapan){
            System.out.println(sumAgesFromThailand);
        }else{
            System.out.println(sumAgesFromJapan);
        }

        int sumAgesFromUSFemale = finalList.stream().filter((p) -> p.getCountry().
                equalsIgnoreCase("united states") &&
                p.getGender().equalsIgnoreCase("female")).mapToInt((p) -> p.getAge()).sum();

        int sumAgesFromUKFemale = finalList.stream().filter((p) -> p.getCountry().
                equalsIgnoreCase("united kingdom") &&
                p.getGender().equalsIgnoreCase("female")).mapToInt((p) -> p.getAge()).sum();
        if(sumAgesFromUSFemale > sumAgesFromUKFemale){
            System.out.println(sumAgesFromUSFemale);
        }else{
            System.out.println(sumAgesFromUKFemale);
        }
    }
}

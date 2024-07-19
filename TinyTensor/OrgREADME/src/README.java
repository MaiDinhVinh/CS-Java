import java.time.LocalDate;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * The member list will be updated soon, since Notion system is awaiting to be promoted
 * from "free" plan to "Education" plan !
 */
public class README {
    public static void main(String[] args) throws InterruptedException{
        String write_line = null;
        List<Credit> all_project_members = new ArrayList<>();
        String separation = "\t";
        String[] final_separation = new String[4];
        Path read = Paths.get("src/memberlist.txt");
        try(BufferedReader br = Files.newBufferedReader(read, StandardCharsets.UTF_8)){
            br.readLine();
            while((write_line = br.readLine()) != null){
                final_separation = write_line.split(separation);
                all_project_members.add(new Credit(final_separation[0],
                        final_separation[1], final_separation[2], final_separation[3]));
            }
        } catch(Exception e){
            System.out.println("Exception Detected ! " + e.getStackTrace());
        }

        List<String> held_position = new ArrayList<>();
        held_position.add("Ha Noi City");
        held_position.add("Ho Chi Minh City");
        Organization mainObject = new Organization("TinyTensor",
                "Nourishing and inspiring the AI passion for all young middle schoolers",
                "Speed and acceleration in our lives",
                "Storing all of necessary codes for the project",
                held_position, all_project_members, all_project_members.stream().count());
        int user_input = 0;
        boolean escape = false;
        boolean invalid_input = false;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Welcome to About Us program ! - wrote by DucksaberVN (JDK 1.8)");
//            Thread.sleep(1000);
            System.out.println("1 - What is our project name ?");
            System.out.println("2 - What is our main project aim ?");
            System.out.println("3 - What is our primary project theme for 2024 session ?");
            System.out.println("4 - What are the purposes of these repositories ?");
            System.out.println("5 - Where will we going to hold the project ?");
            System.out.println("6 - Showing the list of all members in this project");
            System.out.println("7 - How many members has joined since the start of the project ?");
            System.out.println("8 - End program");
            try{
                System.out.print("Please enter your choice: ");
//                user_input = sc.nextInt();
                String input_str = sc.nextLine();
                user_input = Integer.parseInt(input_str);
                System.out.println("###" + user_input);
                switch (user_input){
                    case 1:
                        System.out.println(mainObject.getOur_project_name());
                        break;
                    case 2:
                        System.out.println(mainObject.getOur_project_aim());
                        break;
                    case 3:
                        System.out.println(mainObject.getProject_2024_theme());
                        break;
                    case 4:
                        System.out.println(mainObject.getPurpose_of_repo());
                        break;
                    case 5:
                        mainObject.getProject_will_be_held_at();
                        break;
                    case 6:
                        mainObject.getAll_project_members();
                        break;
                    case 7:
                        System.out.println("On " + LocalDate.now() + ", there are "
                                + mainObject.getMember_count() + " members has joined the project");
                        break;
                    case 8:
                        escape = true;
                        break;
                }
            } catch(Exception echoose){
                System.out.println("Invalid input, please type again");
                invalid_input = true;
            } finally{
                if(escape){
                    break;
                }
                char condition = ' ';
//                Scanner check_condit = new Scanner(System.in);
                do{
                    if(invalid_input){
                        break;
                    }
                    System.out.print("Do you want to run the program again (y/n or Y/N) ?: ");
//                    condition = check_condit.next().charAt(0);
                    String check_str = sc.nextLine();
                    condition = check_str.charAt(0);
                    if(condition == 'n' || condition == 'N'){
                        escape = true;
                    } else if(condition != 'y' && condition != 'Y'){
                        System.out.println("Invalid input, please type again !");
                    }
                }while(condition != 'n' && condition != 'N' && condition != 'y' && condition != 'Y');
                invalid_input = false;
            }
        }while(!escape);
    }
}
class Credit{
    private String firstname;
    private String lastname;
    private String team;
    private String position;

    Credit(String firstname, String lastname, String team, String position){
        this.firstname = firstname;
        this.lastname = lastname;
        this.team = team;
        this.position = position;
    }

    String getFirstname(){
        return this.firstname;
    }

    String getLastname(){
        return this.lastname;
    }

    String getTeam(){
        return this.team;
    }

    String getPosition(){
        return this.position;
    }

    @Override
    public String toString(){
        return "[firstname= " + this.firstname + ", " + "lastname= " + this.lastname + ", "
                + "team= " + this.team + ", " + "position= " + this.position + "]";
    }
}

class Organization{
    private String our_project_name;
    private String our_project_aim;
    private String project_2024_theme;
    private String purpose_of_repo;
    private List<String> project_will_be_held_at;
    private List<Credit> all_project_members;
    private long member_count;

    Organization(String our_project_name, String our_project_aim,
                 String project_2024_theme, String purpose_of_repo,
                 List<String> project_will_be_held_at, List<Credit> all_project_members,
                 long member_count){
        this.our_project_name = our_project_name;
        this.our_project_aim = our_project_aim;
        this.project_2024_theme = project_2024_theme;
        this.purpose_of_repo = purpose_of_repo;
        this.project_will_be_held_at = project_will_be_held_at;
        this.all_project_members = all_project_members;
        this.member_count = member_count;
    }

    String getOur_project_name(){
        return this.our_project_name;
    }

    String getOur_project_aim(){
        return this.our_project_aim;
    }

    String getProject_2024_theme(){
        return this.project_2024_theme;
    }

    String getPurpose_of_repo(){
        return this.purpose_of_repo;
    }

    void getProject_will_be_held_at(){
        this.project_will_be_held_at.forEach(m -> {
            int i = 0;
            System.out.println("Position " + i + ": " + m);
            i++;
        });
    }

    void getAll_project_members(){
        Collections.sort(this.all_project_members, (pm1, pm2) -> {
            return pm1.getFirstname().compareTo(pm2.getFirstname());
        });
        this.all_project_members.forEach(m -> System.out.println(m));
    }

    long getMember_count(){
        return this.member_count;
    }
}

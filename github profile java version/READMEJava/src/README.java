import java.util.ArrayList;
import java.util.List;
class READMEMechanism {
    private String welcomingSlogan;

    private String govermentName;

    private String nickName;

    private String whoAmI;

    private String favoriteSubject;

    private String whichClubImIn;

    private String favoriteGame;

    private String favoriteSport;

    private String currentSkill;

    private String contactEmail;

    private String personalWebsite;

    private List<String> myGitProfile = new ArrayList<>();

    public READMEMechanism(){
        this.welcomingSlogan = "Welcome to the ricefield (VN) 👋";
        this.govermentName = "MaiDinhVinh";
        this.nickName = "😎 Nickname: DucksaberVN or VinhDev";
        this.whoAmI = "☠ A typical highschool student";
        this.favoriteSubject = "Physic enjoyer, CS lover, Mathematic hater (tho im good at math, idk)";
        this.whichClubImIn = "🖥 FPT Software Club";
        this.favoriteGame = "Favorite game: Minecraft, CS2, Geometry Dash";
        this.favoriteSport = "Retired Badminton Defender (Arcsaber 11 Pro - Halbertec 8000)";
        this.currentSkill = "♨ Java Core (Prepare for upcoming Java Certified Professional Dev)";
        this.contactEmail = "ducksabervn@vinhdev.vn";
        this.personalWebsite = "vinhdev.vn (underconstruction)";
    }

    public void addAttribute(){
        this.myGitProfile.add(this.welcomingSlogan);
        this.myGitProfile.add(this.govermentName);
        this.myGitProfile.add(this.nickName);
        this.myGitProfile.add(this.whoAmI);
        this.myGitProfile.add(this.favoriteSubject);
        this.myGitProfile.add(this.whichClubImIn);
        this.myGitProfile.add(this.favoriteGame);
        this.myGitProfile.add(this.favoriteSport);
        this.myGitProfile.add(this.currentSkill);
        this.myGitProfile.add(this.contactEmail);
        this.myGitProfile.add(this.personalWebsite);
    }


    public void getMyProfile(){
        this.myGitProfile.forEach(m -> System.out.println(m));
    }
}

public class README{
    public static void main(String[] args) {
        READMEMechanism VinhDev = new READMEMechanism();
        VinhDev.addAttribute();
        VinhDev.getMyProfile();
    }
}


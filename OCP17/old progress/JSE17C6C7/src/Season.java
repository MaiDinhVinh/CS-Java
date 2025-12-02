public enum Season{
    WINTER, SPRING, SUMMER, FALL
}

class Test2{
    public static void main(String[] args) {
        var s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);

        //for snippet 28
        for(Enum season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        //for snippet 29

//        if (Season.SUMMER == 2) {}

        //for snippet 30

        Season s2 = Season.valueOf("SUMMER");
        Season t = Season.valueOf("summer");

        //for snippet 31
        Season summer = Season.SUMMER;
        switch(summer) {
            case WINTER:
                System.out.print("Get out the sled!");
            case SUMMER:
                System.out.print("Time for the pool!");
            default:
                System.out.print("Is it summer yet?");
        };

        //for snippet 32

//        Season summer2 = Season.SUMMER;
//        var message = switch(summer) {
//            case Season.WINTER -> "Get out the sled!";
//            case 0 -> "Time for the pool!";
//            default -> "Is it summer yet?";
//        };
//        System.out.print(message);
    }
}
class lab4_ex1{
    public static void triangle(){
        System.out.println("    *    ");
        System.out.println("   *  *  ");
        System.out.println("  *    * ");
        System.out.println(" ********");
    }

    public static void rectangle(){
        System.out.println("  ******");
        System.out.println("  *    *");
        System.out.println("  *    *");
        System.out.println("  *    *");
        System.out.println("  ******");
    }

    public static void circle(){
        System.out.println("    **  ");
        System.out.println("  *    *");
        System.out.println("  *    *");
        System.out.println("    **  ");
    }

    public static void invertedV(){
        System.out.println("    *    ");
        System.out.println("   *  *  ");
        System.out.println("  *    * ");
        System.out.println(" *      *");
    }

    public static void main(String[] args){
        //ve rocket
        System.out.println("---ROCKET--\n");
        triangle();
        rectangle();
        invertedV();
        System.out.println("---END OF ROCKET---\n");

        //ve male
        System.out.println("---MALE---\n");
        circle();
        rectangle();
        invertedV();
        System.out.println("---END OF MALE---\n");

        //ve female
        System.out.println("---FEMALE---\n");
        circle();
        triangle();
        invertedV();
        System.out.println("---END OF FEMALE---\n");


    }
}
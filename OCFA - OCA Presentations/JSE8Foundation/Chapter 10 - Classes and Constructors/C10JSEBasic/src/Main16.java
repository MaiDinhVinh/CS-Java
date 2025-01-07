/*
class Scopes{
    int x; //visible throughout the class
    static int y; //visible throughout the class
    public static void method1(int param1){ //visible throughout the method
        int local1 = 0; //visible throughout the method
        {
            int anonymousBlock = 0; //visible in this block only
        }
        anonymousBlock = 1; //compilation error
        for(int loop1=0; loop1<10; loop1++){int loop2 = 0; //loop1 and loop2 are visible only here
        }
        loop1 = 0; //compilation error
        loop2 = 0; //compilation error
        if(local1==0){
            int block1 = 0; //visibile only in this if block
        }
        block1 = 7; //compilation error
        switch(param1){
            case 0:
                int block2 = 10; //visible all over case block
                break;
            case 1:
                block2 = 5; //valid
                break;
            default:
                System.out.println(block2); //block2 is visible here but compilation error because block2 may be left uninitialized before access
        }
        block2 = 9; //compilation error
        int loop1 = 0, loop2 = 0, block1 = 0, block2 = 8; //all valid
    }
}
*/

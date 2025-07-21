package ReviewQuestion;
import java.util.ArrayList;

class Locker
{
    private boolean inUse;

    public boolean isInUse()
    {   return inUse;    }

    public void setInUse(boolean isInUse)
    {   inUse = isInUse;    }
}

public class School
{
    private ArrayList <Locker> lockerlist;

    /*   Additional implementation not shown   */

    /**
     * This method counts the number of empty lockers in the list of lockers.
     * @param lockers the list of Locker objects
     * @return the number of empty lockers
     * PRECONDITION:   No object in the list lockers is null
     *                 (every locker has a true/false value)
     */
    public static int countEmptyLockers(ArrayList <Locker> lockers)
    {
        int count = 0;
        for(Locker l: lockers){
            if(!l.isInUse()) count++;
        }
        return count;
    }
}

//1 3 8 5 6 4 2 7
//1 2 8 5 6 4 3 7
//1 2 3 5 6 4 8 7
//1 2 3 4 6 5 8 7
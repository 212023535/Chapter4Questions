package za.ac.cput.ch4.q1;

/**
 * Created by student on 2015/02/26.
 */
public class PLKSecondClass extends PLKThirdClass
{
    public static int getFive()
    {
        int s = PLKThirdClass.sendFive();
        return s;
    }
}

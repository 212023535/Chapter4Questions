package za.ac.cput.ch4.q1;

/**
 * Created by student on 2015/02/26.
 */
public class PLKFirstClass extends PLKSecondClass
{
    public int receiveFive()
    {
        int a = PLKSecondClass.getFive();
        return a;
    }
}

package za.ac.cput.ch4.q1;

/**
 * Created by student on 2015/02/26.
 */
public class ISPCalculatorClass implements ISPAddInterface,ISPSubtractInterface
{
    @Override
    public int add(int a, int b)
    {
        return (a+b);
    }
    
    @Override
    public int subtract(int a, int b)
    {
        return (a-b);
    }

}

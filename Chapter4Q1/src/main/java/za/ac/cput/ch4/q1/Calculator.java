package za.ac.cput.ch4.q1;

/**
 * Created by student on 2015/02/25.
 */
public class Calculator implements CalculatorInterface
{
    @Override
    public int addItems(int item1, int item2)
    {
        return (item1+item2);
    }

    @Override
    public int subtractItems(int item1, int item2)
    {
        return (item1-item2);
    }
}

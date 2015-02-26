package za.ac.cput.ch4.q1;

/**
 * Created by student on 2015/02/25.
 */
public class Calculator
{

    /*USING COMPOSITION AS AN ALTERNATIVE SOLUTION TO INHERITANCE*/

    CalculatorMethods cMeth = new CalculatorMethods();

    public int addItems(int i1,int i2)
    {
        return (cMeth.addItems(i1,i2));
    }

    public int subtractItems(int i1,int i2)
    {
        return (cMeth.subtractItems(i1,i2));
    }
}

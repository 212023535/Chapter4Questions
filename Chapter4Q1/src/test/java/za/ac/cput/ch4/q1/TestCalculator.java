package za.ac.cput.ch4.q1;

/**
 * Created by student on 2015/02/25.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator
{
    private Calculator calc;

    @Before
    public void setUp() throws Exception
    {
        calc = new AddItems();
        calc = new SubtractItems();
    }

    @Test
    public void testdd() throws Exception
    {
        Assert.assertEquals("Addition Test Passed",100,calc.addItems(75,25));

    }

    @Test
    public void testSubtract() throws Exception
    {
        Assert.assertEquals("Subtraction Test Passed",10,calc.subtractItems(30,20));
    }
}

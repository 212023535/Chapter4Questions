package za.ac.cput.ch4.q1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


/**
 * Created by student on 2015/02/25.
 */
public class TestCalculator
{
    Calculator calc = new Calculator();

    @Test
    public void testAdd() throws Exception
    {
        Assert.assertEquals("THE VALUES WERE CORRECTLY ADDED",20,calc.addItems(10,10));
    }

    @Test
    public void testSubtract() throws Exception
    {
        Assert.assertEquals("THE VALUES WERE CORRECTLY SUBTRACTED",20,calc.subtractItems(40,20));
    }
}

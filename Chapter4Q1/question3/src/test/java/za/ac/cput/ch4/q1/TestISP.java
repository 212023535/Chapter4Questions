package za.ac.cput.ch4.q1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/26.
 */
public class TestISP
{
    ISPCalculatorClass isp = new ISPCalculatorClass();

    @Test
    public void testAdd()
    {
        Assert.assertEquals(5,isp.add(2, 3));
    }

    @Test
    public void testSubtract()
    {
        Assert.assertEquals(5,isp.subtract(10,5));
    }

}

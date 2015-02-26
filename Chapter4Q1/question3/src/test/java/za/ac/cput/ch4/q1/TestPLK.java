package za.ac.cput.ch4.q1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/26.
 */
public class TestPLK
{

    PLKFirstClass f1 = new PLKFirstClass();

    @Test
    public void testPLK()
    {
        Assert.assertEquals(5,f1.receiveFive());
    }
}

package za.ac.cput.ch4.q1;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

/**
 * Created by student on 2015/02/26.
 */
public class TestSRP
{
    SRPFail f = new SRPFail();
    SRPPass p = new SRPPass();

    @Test
    public void testSRPFail()
    {
        Assert.assertEquals(2,f.Method2());
        System.out.println("FAIL: There are " + f.Method2() + " methods in this class which means there is more than one reason to change");
    }

    @Test
    public void testSRPPass()
    {
        Assert.assertEquals(1,p.method1());
        System.out.println("PASS: There is only " + p.method1() + " method in this class so only one reason to change if needed");
    }
}

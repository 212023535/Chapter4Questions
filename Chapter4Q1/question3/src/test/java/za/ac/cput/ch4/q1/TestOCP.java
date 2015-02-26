package za.ac.cput.ch4.q1;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by student on 2015/02/26.
 */
public class TestOCP extends OCPFail
{
    @Override
    public String OCPReturn() {
        return null;
    }

    @Test
    public void testOPCFail()
    {
        Assert.assertEquals(5,fail());
        System.out.print("Class OCPFail cannot change a method, it can merely add a new method");
    }

    @Test
    public void testOPCPass()
    {
        OCPPass p = new OCPPass();
        Assert.assertEquals("OCP",p.OCPReturn());

    }
}

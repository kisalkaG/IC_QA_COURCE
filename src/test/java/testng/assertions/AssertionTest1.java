package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest1 {
    @Test
    public void testAssertEquals() {
        String actualValue = "Sri Lanka";
        System.out.println("Prior to Assertion");
        Assert.assertEquals(actualValue,"Sri lanka","String mismatch:");
        System.out.println("After Assertion");
    }

    @Test
    public void testAssertEquals2() {
        String actualValue = "Sri Lanka";
        System.out.println("Prior to Assertion");
        Assert.assertEquals(actualValue,"Sri Lanka","String mismatch:");
        System.out.println("After Assertion");
    }

    @Test
    public void testAssertNotEquals() {
        String actualValue = "Sri Lanka";
        System.out.println("Prior to Assertion");
        Assert.assertNotEquals(actualValue,"Sri lanka","String mismatch:");
        System.out.println("After Assertion");
    }

    @Test
    public void testAssertTrue() {
        boolean actualVal = false;
        Assert.assertTrue(actualVal,"Boolean mismatch");
    }

    @Test
    public void testAssertFalse() {
        boolean actualVal = false;
        Assert.assertFalse(actualVal);
    }
}

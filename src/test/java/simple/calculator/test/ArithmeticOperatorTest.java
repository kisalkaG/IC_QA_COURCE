package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {
    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();
    }

    @Test
    public void testSum() {
        int actualValue = calc.sum(100,149);
        Assert.assertEquals(actualValue,249,"Failed to calculate sum:");
    }

    @Test
    public void testSum2() {
        Assert.assertEquals(calc.sum(0,1),1);
        Assert.assertEquals(calc.sum(0,-1),-1);
        Assert.assertEquals(calc.sum(-2147483647, -1),-2147483648);
        Assert.assertEquals(calc.sum(2147483646, 1), 2147483647);
    }
}

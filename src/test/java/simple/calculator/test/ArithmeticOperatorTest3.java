package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest3 {
    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();
    }

    @Test(dataProvider = "getData")
    public void testSum1(int input1, int input2, int expectedOutput) {
        Assert.assertEquals(calc.sum(input1,input2),expectedOutput);

    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {0,1,1},
                {0,-1,-1},
                {-2147483647,-1,-2147483648},
                {2147483646,1,2147483647}
        };
    }

}

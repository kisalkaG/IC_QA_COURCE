package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest1 {
    @Test(groups = {"smoke" , "reg"})
    public void testGT1_1() {
        System.out.println("GPT1-1");
    }

    @Test(groups = {"reg"})
    public void testGT1_2() {
        System.out.println("GPT1-2");
    }

    @Test
    public void testGT1_3() {
        System.out.println("GPT1-3");
    }

    @Test(groups = {"smoke"})
    public void testGT1_4() {
        System.out.println("GPT1-4");
    }

    @Test(groups = {"smoke" , "reg"})
    public void testGT1_5() {
        System.out.println("GPT1-5");
    }
}

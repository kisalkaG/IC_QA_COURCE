package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest4 {
    @Test(groups = {"smoke" , "reg"})
    public void testGT4_1() {
        System.out.println("GPT4-1");
    }

    @Test(groups = {"reg"})
    public void testGT4_2() {
        System.out.println("GPT4-2");
    }

    @Test(groups = {"smoke"})
    public void testGT4_3() {
        System.out.println("GPT4-3");
    }

    @Test
    public void testGT4_4() {
        System.out.println("GPT4-4");
    }

    @Test(groups = {"reg"})
    public void testGT4_5() {
        System.out.println("GPT4-5");
    }
}

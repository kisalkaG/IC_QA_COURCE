package testng.groups;

import org.testng.annotations.Test;

public class GroupsTest2 {
    @Test
    public void testGT2_1() {
        System.out.println("GPT2-1");
    }

    @Test(groups = {"reg"})
    public void testGT2_2() {
        System.out.println("GPT2-2");
    }

    @Test(groups = {"smoke" , "reg"})
    public void testGT2_3() {
        System.out.println("GPT2-3");
    }
}

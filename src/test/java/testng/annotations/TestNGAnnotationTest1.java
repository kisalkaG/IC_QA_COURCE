package testng.annotations;

import org.testng.annotations.Test;

public class TestNGAnnotationTest1 {
    public static void main(String[] args) {
        System.out.println("Print1");
        TestNGAnnotationTest1 x = new TestNGAnnotationTest1();
        x.print();
    }

    public void print(){
        System.out.println("Print2");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }
}

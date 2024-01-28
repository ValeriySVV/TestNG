package testNG;

import org.testng.annotations.*;

public class TestClassHomeWork1 {


    @Test(priority = 1)
    public void firstTest() {
        System.out.println("It is Test Number 1 @ " + Thread.currentThread().getName());
    }

    @Test(priority = 2)
    public void secondTest() {
        System.out.println("It is Test Number 2 @ " + Thread.currentThread().getName());
    }

    @Test(priority = 3)
    public void thirdTest() {
        System.out.println("It is Test Number 3 @ " + Thread.currentThread().getName());
    }

    @Test(priority = 4)
    public void fourthTest() {
        System.out.println("It is Test Number 4 @ " + Thread.currentThread().getName());
    }

    @Test(priority = 5)
    public void fifthTest() {
        System.out.println("It is Test Number 5 @ " + Thread.currentThread().getName());
    }

    @BeforeSuite
    public void testBeforeSuit() {
        System.out.println("TestClassHomeWork1 :: Test Before Suit @ " + Thread.currentThread().getName());
    }

    @AfterSuite
    public void testAfterSuit() {
        System.out.println("TestClassHomeWork1 :: Test After Suit @ " + Thread.currentThread().getName());
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("TestClassHomeWork1 :: Test Before Class @ " + Thread.currentThread().getName());
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("TestClassHomeWork1 :: Test After Class @ " + Thread.currentThread().getName());
    }

}



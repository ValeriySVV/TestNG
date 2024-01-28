package testNG;

import org.testng.annotations.*;

public class TestClassHomeWork2 {
    @Test(groups = "secondgroup" )
    public void firstTest() {
        System.out.println("It is Test Number 6 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "firstgroup" )
    public void secondTest() {
        System.out.println("It is Test Number 7 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "firstgroup")
    public void thirdTest() {
        System.out.println("It is Test Number 8 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "firstgroup")
    public void fourthTest() {
        System.out.println("It is Test Number 9 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "secondgroup")
    public void fifthTest() {
        System.out.println("It is Test Number 10 @ " + Thread.currentThread().getName());
    }

    @BeforeSuite
    public void testBeforeSuit() {
        System.out.println("TestClassHomeWork2 :: Test Before Suit @ " + Thread.currentThread().getName());
    }

    @AfterSuite
    public void testAfterSuit() {
        System.out.println("TestClassHomeWork2 :: Test After Suit @ " + Thread.currentThread().getName());
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("TestClassHomeWork2 :: Test Before Class @ " + Thread.currentThread().getName());
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("TestClassHomeWork2 :: Test After Class @ " + Thread.currentThread().getName());
    }

}


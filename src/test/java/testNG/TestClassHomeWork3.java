package testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClassHomeWork3 {
    @Test(groups = "secondgroup")
    public void firstTest() {
        System.out.println("It is Test Number 11 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "secondgroup")
    public void secondTest() {
        System.out.println("It is Test Number 12 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "secondgroup")
    public void thirdTest() {
        System.out.println("It is Test Number 13 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "thirdgroup")
    public void fourthTest() {
        System.out.println("It is Test Number 14 @ " + Thread.currentThread().getName());
    }

    @Test(groups = "thirdgroup")
    public void fifthTest() {
        System.out.println("It is Test Number 15 @ " + Thread.currentThread().getName());
    }

    @BeforeSuite
    public void testBeforeSuit() {
        System.out.println("TestClassHomeWork3 :: Test Before Suit @ " + Thread.currentThread().getName());
    }

    @AfterSuite
    public void testAfterSuit() {
        System.out.println("TestClassHomeWork3 :: Test After Suit @ " + Thread.currentThread().getName());
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("TestClassHomeWork3 :: Test Before Class @ " + Thread.currentThread().getName());
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("TestClassHomeWork3 :: Test After Class @ " + Thread.currentThread().getName());
    }


}

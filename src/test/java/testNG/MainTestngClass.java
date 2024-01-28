package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class MainTestngClass {
    public void testEqualsSuccessfully() {
        var actual = "2";
        var expected = "2";

        Assert.assertEquals(actual, expected, "test failed");
        Assert.assertNotNull(actual);
    }

    public void testSoftAssertions() {
        var actual = "2";
        var expected = "2";

        var softAssert = new SoftAssert();
        softAssert.assertNotNull(actual);
        //softAssert.assertNull(expected);
        softAssert.assertEquals(actual, expected);
        //softAssert.assertNotEquals(actual, expected);
        softAssert.assertAll();
    }

}

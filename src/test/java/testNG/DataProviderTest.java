package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataProviderTest {
    @DataProvider
    public Object[][] data() {
        return new Object[][] {
                {1, 2, 3},
                {3, 4, 7},
                {5, 6, 11},
                {5, 6, 11},
                {5, 6, 11}
        };
    }
    @Test(dataProvider = "data")
    public void addTest(int first, int second, int expectedSum) {
        int sum = first + second;
        assertEquals(sum, expectedSum);
    }
}


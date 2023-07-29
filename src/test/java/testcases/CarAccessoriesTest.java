package testcases;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CarAccessoriesTest extends BaseTest {

    @Test(dataProvider = "myData")
    public void testToAddElementToCart(String text) {
        String actualResult = "المجموع الجزئي (1 سلعة):";
        String expectedResult;
        searchPage.sendTextToSearchFor(text);
        searchPage.addFirstElementToCart();
        expectedResult = searchPage.getTextFromCart();
        assertEquals(actualResult, expectedResult,"item not exist or more one item is exist");
    }

    @DataProvider
    public Object[][] myData() {
        Object[][] data = new Object[2][1];
        data[0][0] = "car accessories";
        data[1][0] = "Car Accessories";
        return data;
    }


}
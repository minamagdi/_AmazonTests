package testcases;

import base.BaseTest;
import org.testng.annotations.Test;


public class TodayDealsTest extends BaseTest {

    @Test
    public void testTodayDeals() {
        todayDealsPage.todaySelection();
    }
}

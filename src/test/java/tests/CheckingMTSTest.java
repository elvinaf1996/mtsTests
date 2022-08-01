package tests;

import org.junit.Test;
import pages.HomePage;

public class CheckingMTSTest {
    int countPromo = 6;

    @Test
    public void CheckItemInBasketTest(){
        HomePage homePage = new HomePage();
        homePage.openPage().checkChangeOfPictures(countPromo);
    }
}

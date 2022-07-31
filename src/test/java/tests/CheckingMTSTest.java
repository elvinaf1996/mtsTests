package tests;

import jdk.jfr.Description;
import org.junit.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.switchTo;

public class CheckingMTSTest {
    int countPromo = 6;

    @Test
    public void CheckItemInBasketTest(){
        HomePage homePage = new HomePage();
        homePage.openPage().checkChangeOfPictures(countPromo);
    }
}

package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static tests.BaseTest.cfg;

public class HomePage {

    private final By START_SHOW_PROMO = By.cssSelector("[style=\"stroke-dashoffset: 180;\"]");

    public HomePage openPage() {
        open(cfg.baseUrl());
        return this;
    }

    public HomePage checkChangeOfPictures(int countPromo){
        for(int i = 0; i < countPromo; i++){
            $(START_SHOW_PROMO).shouldBe(Condition.visible, Duration.ofSeconds(20));
        }
        return this;
    }

}

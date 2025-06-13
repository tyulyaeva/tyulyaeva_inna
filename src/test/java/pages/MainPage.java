package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private static final String  MainPage = "https://www.labirint.ru/",
                            AUTHOR = "Стивен Кинг";

    public MainPage MainPage() {
        open(MainPage);
        return this;
    }

    public MainPage AuthorSearch() {
        $("[id=search-field").
                setValue(AUTHOR).pressEnter();
        return this;
    }

    public MainPage changeSity() {
        $(".region-location-icon-txt").shouldBe(visible).click();
        $(".g-alttext-deepblue:nth-child(3)").click();
        return this;
    }

    public MainPage checkChangeSityClick() {
        $(".region-location-icon-txt")
                .shouldHave(text("Санкт-Петербург"));
        return this;
    }
}

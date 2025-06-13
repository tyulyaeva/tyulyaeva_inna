package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckProductCardPage {

    private static final String  MainPage = "https://www.labirint.ru/",
                            AUTHOR = "Стивен Кинг",
                            BOOKNAME = "Противостояние";

    public CheckProductCardPage MainPage() {
        open(MainPage);
        return this;
    }

    public CheckProductCardPage SearchPage() {
        $("[id=search-field").
                setValue(AUTHOR).pressEnter();
        return this;
    }

    public CheckProductCardPage BookPage() {
        $(".search-result")
                .shouldHave(text(BOOKNAME));
        return this;
    }

    public CheckProductCardPage checkProductCardPage() {
        $("._h1_5o36c_18").shouldHave(text(BOOKNAME));
        return this;
    }
}

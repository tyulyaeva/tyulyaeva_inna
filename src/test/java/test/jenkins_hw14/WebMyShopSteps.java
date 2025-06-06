package test.jenkins_hw14;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.error.ShouldHave.shouldHave;

public class WebMyShopSteps {
    @Step("Открыть страницу: https://my-shop.ru/")
    public WebMyShopSteps openMyShopMainPage() {
        open("https://www.labirint.ru/");
        return this;
    }

    @Step("Найти книгу 'Гиперион' автора 'Дэн Симмонс'")
    public WebMyShopSteps myShopBookSearchTest() {
        $("[id=search-field").
                setValue("Лев Толстой").pressEnter();
        $(".search-result")
                .shouldHave(text("Воскресение"));
        return this;
    }

    @Step("Открыть меню 'Каталог'")
    public WebMyShopSteps openCatalogMenu() {
        $(".menu-title").shouldBe(visible).click();
        return this;
    }
}

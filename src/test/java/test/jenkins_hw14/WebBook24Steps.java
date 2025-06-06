package test.jenkins_hw14;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebBook24Steps {
    @Step("Открыть страницу: https://my-shop.ru/")
    public WebBook24Steps openBook24MainPage() {
        open("https://my-shop.ru/");
        return this;
    }
    @Step("Закрыть формы выбора локации пользователя")
    public WebBook24Steps closeLocationForm() {
        $(".menu-title").click();
        return this;
    }
}

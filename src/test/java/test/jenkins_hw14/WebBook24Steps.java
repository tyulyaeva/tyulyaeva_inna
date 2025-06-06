package test.jenkins_hw14;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebBook24Steps {
    @Step("Открыть страницу: https://book24.ru/")
    public WebBook24Steps openBook24MainPage() {
        open("https://book24.ru/");
        return this;
    }
    @Step("Закрыть формы выбора локации пользователя")
    public WebBook24Steps closeLocationForm() {
        $(".location-d__popup-close").click();
        return this;
    }
}

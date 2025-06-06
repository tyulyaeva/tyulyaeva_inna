package test.jenkins_hw14;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test.TestBase;

public class WebBook24VacancyTests extends TestBase {
    @Tag("book24_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска определенной серии книг")
    void searchResultsShouldContainDeterminedBookTest () {
        WebBook24Steps steps = new WebBook24Steps();
        steps.openBook24MainPage()
                .closeLocationForm();
    }
}

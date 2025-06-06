package test.jenkins_hw14;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test.TestBase;

@DisplayName("MyShop тесты")
public class WebMyShopVacancyTests extends TestBase {
        @BeforeEach
        public void setupConfig(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy ="eager";
        Configuration.baseUrl = "https://my-shop.ru/";
    }


    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://my-shop.ru/")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска определенной серии книг")
    void searchResultsShouldContainDeterminedBookTest () {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
             .myShopBookSearchTest();
    }
}

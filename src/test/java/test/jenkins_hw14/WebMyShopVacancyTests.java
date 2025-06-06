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
//        @BeforeEach
//        public void setupConfig(){
//        Configuration.browserSize = "1920x1080";
//        Configuration.pageLoadStrategy ="eager";
//        Configuration.baseUrl = "https://www.labirint.ru/";
//    }


    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска книги")
    void searchResultsShouldContainDeterminedBookTest () {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
             .myShopBookSearchTest();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №2: Проверка перехода в раздел 'Офисная канцелярия' с помощью меню 'Канцелярия'")
    @Test
    void checkMenuCatalogSectionTest() {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .openCatalogMenu();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №3: Проверка просмотра первой карточки товара")
    @Test
    void checkProductCardTest() {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .myShopBookSearchTest()
                .openProductCard();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №4: Проверка добавления товара в корзину")
    @Test
    void checkPenBasketTest() {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .myShopBookSearchTest()
                .openProductCard()
                .addPenBasketTest();

    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №5: Проверка смены города")
    @Test
    void changeLocationPersonTest() {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .changeSity()
                .checkChangeSityClick();
    }

}

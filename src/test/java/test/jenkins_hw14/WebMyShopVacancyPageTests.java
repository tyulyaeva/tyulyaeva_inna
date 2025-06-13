package test.jenkins_hw14;
//import WebMyShopStepsPageObjects;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test.TestBase;

@DisplayName("Labirint.ru тесты")
public class WebMyShopVacancyPageTests extends TestBase {

    private static final String AUTHOR = "Стивен Кинг";
    private static final String BOOKNAME = "Противостояние";


    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска книги")
    void searchResultsShouldContainDeterminedBookTest () {
        WebMyShopStepsPageObjects steps = new WebMyShopStepsPageObjects();
        steps.openMyShopMainPage()
             .myShopAuthorSearch()
             .myShopBookSearch();
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №2: Проверка перехода в раздел 'Офисная канцелярия' с помощью меню 'Канцелярия'")
    @Test
    void checkMenuCatalogSectionTest() {
        WebMyShopStepsPageObjects steps = new WebMyShopStepsPageObjects();
        steps.openMyShopMainPage()
                .openCatalogMenu();
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №3: Проверка просмотра карточки товара")
    @Test
    void checkProductCardTest() {
        WebMyShopStepsPageObjects steps = new WebMyShopStepsPageObjects();
        steps.openMyShopMainPage()
                .myShopAuthorSearch()
                .myShopBookSearch()
                .openProductCard()
                .checkProductCard();
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №4: Проверка добавления товара в корзину")
    @Test
    void checkPenBasketTest() {
        WebMyShopStepsPageObjects steps = new WebMyShopStepsPageObjects();
        steps.openMyShopMainPage()
                .myShopAuthorSearch()
                .myShopBookSearch()
                .openProductCard()
                .addPenBasketTest();

    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №5: Проверка смены города")
    @Test
    void changeLocationPersonTest() {
        WebMyShopStepsPageObjects steps = new WebMyShopStepsPageObjects();
        steps.openMyShopMainPage()
                .changeSity()
                .checkChangeSityClick();
    }

}

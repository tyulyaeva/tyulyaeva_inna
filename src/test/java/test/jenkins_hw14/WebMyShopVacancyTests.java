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

@DisplayName("Labirint.ru тесты")
public class WebMyShopVacancyTests extends TestBase {

    private static final String AUTHOR = "Стивен Кинг";
    private static final String BOOKNAME = "11/22/63";


    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска книги")
    void searchResultsShouldContainDeterminedBookTest () {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
             .myShopBookSearch(AUTHOR,BOOKNAME);
    }

    @Tag("myshop_form")
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

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №3: Проверка просмотра карточки товара")
    @Test
    void checkProductCardTest() {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .myShopBookSearch(AUTHOR,BOOKNAME)
                .openProductCard()
                .checkProductCard(BOOKNAME);
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №4: Проверка добавления товара в корзину")
    @Test
    void checkPenBasketTest() {
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .myShopBookSearch(AUTHOR,BOOKNAME)
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
        WebMyShopSteps steps = new WebMyShopSteps();
        steps.openMyShopMainPage()
                .changeSity()
                .checkChangeSityClick();
    }

}

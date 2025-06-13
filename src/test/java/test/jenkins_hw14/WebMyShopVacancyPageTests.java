package test.jenkins_hw14;
import pages.*;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test.TestBase;

@DisplayName("Labirint.ru тесты")
public class WebMyShopVacancyPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    BookPage bookPage = new BookPage();
    BasketPage basketPage = new BasketPage();
    CatalogSectionPage catalogSectionPage = new CatalogSectionPage();

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска книги")
    void searchResultsShouldContainDeterminedBookTest () {
        WebMyShopVacancyPageTests steps = new WebMyShopVacancyPageTests();
        steps.mainPage.MainPage();
        mainPage.AuthorSearch();
        searchPage.SearchPage();
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №2: Проверка перехода в раздел 'Офисная канцелярия' с помощью меню 'Канцелярия'")
    @Test
    void checkMenuCatalogSectionTest() {
        WebMyShopVacancyPageTests steps = new WebMyShopVacancyPageTests();
        steps.mainPage.MainPage();
        catalogSectionPage.openCatalogMenu();
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №3: Проверка просмотра карточки товара")
    @Test
    void checkProductCardTest() {
        WebMyShopVacancyPageTests steps = new WebMyShopVacancyPageTests();
        steps.mainPage.MainPage();
        mainPage.AuthorSearch();
        searchPage.SearchPage();
        bookPage.openProductCard();
        bookPage.checkProductCardPage();
    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №4: Проверка добавления товара в корзину")
    @Test
    void checkPenBasketTest() {
        WebMyShopVacancyPageTests steps = new WebMyShopVacancyPageTests();
        steps.mainPage.MainPage();
        mainPage.AuthorSearch();
        searchPage.SearchPage();
        bookPage.openProductCard();
        bookPage.clickToAddProduct();
        basketPage.checkPenBasketTest();

    }

    @Tag("myshop_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.labirint.ru/")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №5: Проверка смены города")
    @Test
    void changeLocationPersonTest() {
        WebMyShopVacancyPageTests steps = new WebMyShopVacancyPageTests();
        steps.mainPage.MainPage();
        mainPage.changeSity();
        mainPage.checkChangeSityClick();
    }

}

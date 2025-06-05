package test;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@DisplayName("Bookvoed тесты")
public class WebBookvoedVacabcyTests extends TestBase {

    @BeforeEach
    public void setupConfig(){
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy ="eager";
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска определенной серии книг")
    void searchResultsShouldContainDeterminedBookTest () {
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.openBookvoedmainPage()
              .closeLocationForm()
              .bookvoedBookSearchTest();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №2: Проверка перехода в раздел 'Планеры и планинги' с помощью меню 'Каталог'")
    @Test
    void checkMenuCatalogSectionTest() {
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.openBookvoedmainPage()
                .closeLocationForm()
                .openCatalogMenu()
                .openMenuCatalogSection();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №3: Проверка просмотра первой карточки товара из категории 'Сувениры' - 'Красота и уход'")
    @Test
    void checkProductCardTest() {
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.openBookvoedmainPage()
                .closeLocationForm()
                .openSectionSouvenirs ()
                .openSectionBeauty()
                .openProductCard();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №4: Проверка добавления товара из второй карточки на странице в корзину из категории 'Ручки шариковые'")
    @Test
    void checkPenBasketTest() {
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.openBookvoedmainPage()
                .closeLocationForm()
                .openSectionOffice()
                .openSectionPen()
                .addPenBasketTest();

    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №5: Проверка смены города при первом посещении сайта")
    @Test
    void changeLocationPersonTest() {
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.openBookvoedmainPage()
              .changeSityClick()
              .changeSity()
              .checkChangeSityClick();
    }

}

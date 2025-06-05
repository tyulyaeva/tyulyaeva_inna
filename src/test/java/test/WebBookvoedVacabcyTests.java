package test;

import Jenkins.TestBase;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

@DisplayName("Bookvoed тесты")
public class WebBookvoedVacabcyTests extends TestBase {

    @BeforeEach
    void setupConfig(){
        Configuration.browserSize = "1920x1080";
        baseUrl = "https://www.bookvoed.ru/";
        Configuration.pageLoadStrategy ="eager";
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @Test
    @DisplayName("Тест-кейс №1: Проверка поиска определенной серии книг")
    void searchResultsShouldContainDeterminedBookTest () {
        open(baseUrl);
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.closeLocationForm()
              .bookvoedBookSearchTest();
    }

    @Tag("bookvoed_form")
    @Feature("VacancyJavaQa")
    @Story("Тестирование формы сайта: https://www.bookvoed.ru")
    @Owner("inna_tyulyaeva")
    @DisplayName("Тест-кейс №2: Проверка перехода в раздел 'Планеры и планинги' с помощью меню 'Каталог'")
    @Test
    public void checkMenuCatalogSectionTest() {
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
    public void checkProductCardTest() {
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
    public void checkPenBasketTest() {
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
    public void changeLocationPersonTest() {
        WebBookvoedSteps steps = new WebBookvoedSteps();
        steps.openBookvoedmainPage()
              .changeSityClick()
              .changeSity()
              .checkChangeSityClick();
    }

}

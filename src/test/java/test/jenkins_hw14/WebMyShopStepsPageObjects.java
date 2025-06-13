package test.jenkins_hw14;

import io.qameta.allure.Step;
import pages.*;

//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Condition.visible;
//import static com.codeborne.selenide.Selenide.*;

public class WebMyShopStepsPageObjects {

    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    BookPage bookPage = new BookPage();
    BasketPage basketPage = new BasketPage();
    CatalogSectionPage catalogSectionPage = new CatalogSectionPage();

    @Step("Открыть страницу: https://www.labirint.ru/")
    public WebMyShopStepsPageObjects openMyShopMainPage() {
        //open("https://www.labirint.ru/");
        mainPage.MainPage();
        return this;
    }

    @Step("Найти книги автора 'Стивен Кинг'")
    public WebMyShopStepsPageObjects myShopAuthorSearch() {
//        $("[id=search-field").
//                setValue(AUTHOR).pressEnter();
        mainPage.AuthorSearch();
        return this;
    }

    @Step("Найти книгу 'Противостояние' автора 'Стивен Кинг'")
    public WebMyShopStepsPageObjects myShopBookSearch() {
//        $(".search-result")
//                .shouldHave(text(BOOKNAME));
        searchPage.SearchPage();
        return this;
    }

    @Step("Перейти в подраздел 'Офисная канцелярия'")
    public WebMyShopStepsPageObjects openCatalogMenu() {
//        $(".b-header-b-menu-e-list-item.b-toggle.b-header-b-menu-e-list-item-m-temp.analytics-click-js:nth-child(6) .b-header-b-menu-e-text")
//                .shouldBe(visible).click();
//        $(".col-xs-12.col-sm-6.col-md-4.col-xl-3.gutter-genre-list:nth-child(4) a")
//                .shouldBe(visible).click();
//        $(".genre-name")
//                .shouldHave(text("Офисная канцелярия"));
        catalogSectionPage.openCatalogMenu();
        return this;
    }

    @Step("Проверить, что заголовок карточки товара содержит наименование книги")
    public WebMyShopStepsPageObjects checkProductCard() {
//        $("._h1_5o36c_18").shouldHave(text(BOOKNAME));
        bookPage.checkProductCardPage();
        return this;
    }

    @Step("Открыть карточку товара")
    public WebMyShopStepsPageObjects openProductCard() {
        //$(".product-card.need-watch.watched.gtm-watched:first-child .product-card__name:nth-child(3)").click();
        bookPage.openProductCard();
        return this;
    }

    @Step("Добавить товар в корзину")
    public WebMyShopStepsPageObjects addPenBasketTest() {
//        $("._actions_zuu52_155").$("._button_ssd04_1").click();
        bookPage.clickToAddProduct();
        return this;
    }

    @Step("Проверить добавленный товар в корзине")
    public WebMyShopStepsPageObjects checkPenBasketTest() {
//        $("._cartCount_1a3wc_104").click();
//        $(".b-bask-panel.b-bask-panel-order").shouldHave(text("Противостояние"));
        basketPage.checkPenBasketTest();
        return this;
    }


    @Step("Сменить текущую локацию на г.Санкт-Петербург")
    public WebMyShopStepsPageObjects changeSity() {
//        $(".region-location-icon-txt").shouldBe(visible).click();
//        $(".g-alttext-deepblue:nth-child(3)").click();
        mainPage.changeSity();
        return this;
    }

    @Step("Проверить, что установлен в качестве текущей локации г.Санкт-Петербург")
    public WebMyShopStepsPageObjects checkChangeSityClick() {
//        $(".region-location-icon-txt")
//                .shouldHave(text("Санкт-Петербург"));
        mainPage.checkChangeSityClick();
        return this;
    }
}

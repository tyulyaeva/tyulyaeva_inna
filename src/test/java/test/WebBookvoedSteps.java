package test;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebBookvoedSteps {
    @Step("Открыть страницу: https://www.bookvoed.ru")
    public WebBookvoedSteps openBookvoedmainPage() {
        open(baseUrl);
        return this;
    }

    @Step("Закрыть формы выбора локации пользователя")
    public WebBookvoedSteps closeLocationForm() {
        $(".ui-popover-secondary__button-close").click();
        return this;
    }

    @Step("Найти книгу 'Гиперион' автора 'Дэн Симмонс'")
    public WebBookvoedSteps bookvoedBookSearchTest() {
        $("[name=search]").
                setValue("Дэн Симмонс").pressEnter();
        $("div.app-catalog__list")
                .shouldHave(text("Гиперион"));
        return this;

    }

    @Step("Открыть меню 'Каталог'")
    public WebBookvoedSteps openCatalogMenu() {
        $(".header-catalog-button.header-content__catalog").shouldBe(visible).click();
        return this;
    }

    @Step("Перейти к разделу 'Планеры и планинги'")
    public WebBookvoedSteps openMenuCatalogSection() {
        $(".desktop-catalog-menu-list__item:nth-child(2) span:nth-child(2)").click();
        $(".desktop-catalog-menu-list__item:nth-child(3) button:nth-child(1) span:nth-child(1)").click();
        $("div[class='sidebar-wrapper sidebar-catalog desktop-catalog-menu'] li:nth-child(5) a:nth-child(1) span:nth-child(1)")
                .click();
        $(".catalog-page-layout__title").shouldHave(text("Планеры и планинги"));
        return this;
    }
    @Step("Перейти в раздел 'Сувениры'")
    public WebBookvoedSteps openSectionSouvenirs() {
        $(".header-navigation__links-item:nth-child(4)").click();
        return this;
    }

    @Step("Перейти в подраздел 'Красота и уход")
    public WebBookvoedSteps openSectionBeauty() {
        $(".ui-link:nth-child(4)").click();
        return this;
    }

    @Step("Открыть карточку товара")
    public WebBookvoedSteps openProductCard() {
        $(".product-card:nth-child(1) .ui-link").click();
        return this;
    }

    @Step("Перейти в раздел 'Канцелярия'")
    public WebBookvoedSteps openSectionOffice() {
        $(".header-navigation__links-item:nth-child(3)").click();
        return this;
    }
    @Step("Перейти в подраздел 'Ручки шариковые'")
    public WebBookvoedSteps openSectionPen() {
        $(".ui-link:nth-child(3)").click();
        $(".ui-link:nth-child(4)").click();
        return this;
    }

    @Step("Добавить товар в корзину")
    public WebBookvoedSteps addPenBasketTest() {
        $(".product-card:nth-child(2) .ui-button--fullwidth").click();
        $(".user-button-container__counter-text").shouldHave(text("1"));
        return this;
    }

    @Step("Нажать на кнопку 'Изменить город' на форме смены локации пользователя")
    public WebBookvoedSteps changeSityClick() {
        $(".ui-button--size-m.ui-button--fullwidth.ui-button--color-secondary-blue.app-location-city-approve__button-cancel")
                .click();
        return this;
    }

    @Step("Сменить текущую локацию на г.Волгоград'")
    public WebBookvoedSteps changeSity() {
            $(".app-location-popover-content__content").shouldBe(visible);
            $(".ui-modal-header input")
                    .setValue("Волгоград").pressEnter();
            $(".app-location-city-choose-found__city-name span:nth-child(1)")
                    .click();
        return this;
    }
    @Step("Проверить, что установлен в качестве текущей локации г.Волгоград")
    public WebBookvoedSteps checkChangeSityClick() {
        $(".ui-link.ui-link__color-scheme--one.header-info__link.header-info__link--city span")
                .shouldHave(text("Волгоград"));
        return this;
    }
}

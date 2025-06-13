package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BookPage {
    private static final String BOOKNAME = "Противостояние";

    public BookPage checkProductCardPage() {
        $("._h1_5o36c_18").shouldHave(text(BOOKNAME));
        return this;
    }

    public BookPage openProductCard() {
        $(".product-card.need-watch.watched.gtm-watched:first-child .product-card__name:nth-child(3)").click();
        return this;
    }

    public BookPage clickToAddProduct() {
        $("._actions_zuu52_155").$("._button_ssd04_1").click();
        return this;
    }
}

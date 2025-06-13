package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private static final String BOOKNAME = "Противостояние";

    public SearchPage SearchPage() {
        $(".search-result")
                .shouldHave(text(BOOKNAME));
        return this;
    }
}

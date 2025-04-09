import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

 class GoogleTests {
    @Test
    void selenideSearchTest ()
    {
        open("https://www.google.com/");
        $(byName("q")).setValue("Selenide").pressEnter();
        $("#search").shouldHave(text("selenide.org"));
    }
}

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.bing.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("https://selenide.org"));
    }
}
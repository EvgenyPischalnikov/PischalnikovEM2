import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    static {
        Configuration.holdBrowserOpen = false; // Браузер закроется
    }

    @Test
    void successfulSearchTest() {
        open("https://duckduckgo.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=r1-0]").shouldHave(text("https://selenide.org"));
    }
}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        Selenide.open("https://github.com/");
        $(".search-input").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[data-testid=results-list]").$("div").$(byText("selenide")).click();
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));


    }

}

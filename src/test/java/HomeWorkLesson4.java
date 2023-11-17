package src.test.java;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

        public class HomeWorkLesson4 {
        @Test
        void OpenWiki() {

            open("https://github.com/selenide/selenide");
        // Откройте страницу Selenide в Github
        $("#wiki-tab").click();
        //Перейдите в раздел Wiki проекта
        $(".js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).click();
               // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
                //Откройте страницу SoftAssertions
        $("#user-content-3-using-junit5-extend-test-class").sibling(0).$("pre").shouldHave(text("@Test"));
        } //проверьте что внутри SoftAssertions есть пример кода для JUnit5

        }

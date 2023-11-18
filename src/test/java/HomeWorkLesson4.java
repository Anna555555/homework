
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
        $(".wiki-pages-box").shouldHave(text("SoftAssertions"));
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byText("SoftAssertions")).click();
        //Откройте страницу SoftAssertions
        $("#user-content-3-using-junit5-extend-test-class").parent().sibling(0).$("pre").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                "                        class Tests {\n" +
                "                         @Test\n" +
                "                        void test() {\n" +
                "                        Configuration.assertionMode = SOFT;\n" +
                "                        open(\"page.html\");\n" +
                "\n" +
                "                        $(\"#first\").should(visible).click();\n" +
                "                        $(\"#second\").should(visible).click();\n" +
                "                        }\n" +
                "                        }"));
        } //проверьте что внутри SoftAssertions есть пример кода для JUnit5

        }

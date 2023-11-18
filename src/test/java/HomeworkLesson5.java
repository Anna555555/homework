import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeworkLesson5 {@Test
void OpenWiki() {

    open("https://github.com/");
    // Откройте страницу Github
    $(".HeaderMenu-item position-relative flex-wrap flex-justify-between flex-items-center d-block d-lg-flex flex-lg-nowrap flex-lg-items-center js-details-container js-header-menu-item");
    $(byText("Solutions")).hover();
    $(".HeaderMenu-dropdown-link lh-condensed d-block no-underline position-relative py-2 Link--secondary").click();


    //На главной странице GitHub выберите меню Solutions
}}

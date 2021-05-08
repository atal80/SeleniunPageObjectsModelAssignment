package Pages;

import org.openqa.selenium.WebElement;

public class AllLanguages extends BasePage {
    public static String ALL_LANGUAGES_HEBREW_PAGE_HEADER = "//h1[text()='Hebrew - עִבְרִית']";

    public WebElement allLanguagesHebrewHeaderExist() {
        return findElementByXpath(ALL_LANGUAGES_HEBREW_PAGE_HEADER);
    }
}

package Pages;

import org.openqa.selenium.WebElement;

public class BooksByLanguage extends BasePage {

    public static String ENGLISH_ONLY_HEADER = "//h1[text()='English Only']";

    public WebElement englishOnlyPageHeaderExist() {
        return findElementByXpath(ENGLISH_ONLY_HEADER);

    }

}

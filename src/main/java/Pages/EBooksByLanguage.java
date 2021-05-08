package Pages;

import org.openqa.selenium.WebElement;

public class EBooksByLanguage extends BasePage {

    public static String EBOOKS_IN_ENGLISH_ONLY_HEADER = "//*[@id='SiteNavLabel-ebooks-by-language']/ul/li[5]/a";

    public WebElement eBooksInEglishOnlyHeaderExist() {
        return findElementByXpath(EBOOKS_IN_ENGLISH_ONLY_HEADER);
    }
}

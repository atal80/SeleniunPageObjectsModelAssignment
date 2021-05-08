package Pages;

import org.openqa.selenium.WebElement;

public class FAQsPage extends BasePage {

    public static String FAQS_HEADER = "//h1[text()='FAQ/addition info']";

    public WebElement faqsNamePageHeaderExist() {
        return findElementByXpath(FAQS_HEADER);

    }
}

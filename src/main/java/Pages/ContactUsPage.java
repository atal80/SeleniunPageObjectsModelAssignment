package Pages;

import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage {

    public static String CONTACT_US_HEADER = "//h1[text()='Contact us']";
    public static String EMAIL_FIELD = "//input[@name='email']";
    public static String SEND_TEXT_TO_EMAIL_FIELD = "Andrey";
    public static String SEND_YOUR_MESSAGE_BUTTON = "//button[text()=' Send your message ']";

    public static String CONTACT_US_ERROR_MESSAGE = "//*[text()='This field is required.']";


    public WebElement contactUsPageNameHeaderExist() {
        return findElementByXpath(CONTACT_US_HEADER);

    }

    public WebElement sendText() {
        return sendTextToField(EMAIL_FIELD, SEND_TEXT_TO_EMAIL_FIELD);

    }

    public WebElement contactUsErrorMessage() {
     clickElementByXpath(SEND_YOUR_MESSAGE_BUTTON);
    return findElementByXpath(CONTACT_US_ERROR_MESSAGE);

    }
}

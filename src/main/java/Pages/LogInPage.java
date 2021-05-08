package Pages;

import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {
    public static String LOG_IN_HEADER = "//h1[text()='Login']";
    public static String LOGIN_EMAIL_FIELD = "//input[@type='email']";
    public static String EMAIL = "Andrey@gmail.com";
    public static String SIGN_IN_BUTTON = "//input[@value='Sign In']";
    public static String INCORRECT_EMAIL_OR_PASWORD = "//*[text()='Incorrect email or password.']";


    public WebElement logInHeaderExist() {
        return findElementByXpath(LOG_IN_HEADER);
    }

    public WebElement emailField() {
        WebElement element = sendTextToField(LOGIN_EMAIL_FIELD, EMAIL);

        return element;
    }

    public WebElement logInErrorMessage() {
        clickElementByXpath(SIGN_IN_BUTTON);
       return findElementByXpath(INCORRECT_EMAIL_OR_PASWORD);
    }

}

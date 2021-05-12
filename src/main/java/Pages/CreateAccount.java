package Pages;

import org.openqa.selenium.WebElement;

public class CreateAccount extends BasePage {
    public static String FIRST_NAME_FIELD = "//input[@id='FirstName']";
    public static String FIRST_NAME = "Andrey";
    public static String LAST_NAME_FIELD = "//input[@id='LastName']";
    public static String LAST_NAME = "T";
    public static String EMAIL_FIELD = "//input[@id='Email']";
    public static String EMAIL = "AndreyT@gmail.com";
    public static String PASSWORD_FIELD = "//input[@id='CreatePassword']";
    public static String PASSWORD = "1234567";

    public WebElement firstNameField() {
        return sendTextToField(FIRST_NAME_FIELD, FIRST_NAME);
    }

    public WebElement lastNameField() {
        return sendTextToField(LAST_NAME_FIELD, LAST_NAME);
    }

    public WebElement emailField() {
        return sendTextToField(EMAIL_FIELD, EMAIL);
    }

    public WebElement passwordField() {
        return sendTextToField(PASSWORD_FIELD, PASSWORD);
    }
}
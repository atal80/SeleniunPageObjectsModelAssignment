package Pages;

import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage {

    public static String BLOG_HEADER = "//h1[text()='Blog']";
    public static String HOLIDAY = "//*[text()='holiday']";


    public WebElement blogPageNameHeaderExist() {
        return findElementByXpath(BLOG_HEADER);

    }

    public WebElement holidayDropListExist() {
        return findElementByXpath(HOLIDAY);
    }
}
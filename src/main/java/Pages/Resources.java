package Pages;

import org.openqa.selenium.WebElement;

public class Resources extends BasePage {
    public static String RESOURCES_VIDEO_PAGE_HEADER = "//h1[text()='Fun and Educational Videos for Kids']";

    public WebElement resourcesVideoPageHeaderExist() {
        return findElementByXpath(RESOURCES_VIDEO_PAGE_HEADER);
    }
}

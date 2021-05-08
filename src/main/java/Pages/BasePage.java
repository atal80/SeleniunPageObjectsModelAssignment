package Pages;

import Utils.ShareDriver;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BasePage {
    private static final Logger logger = (Logger) LogManager.getLogger(BasePage.class);
    protected static WebDriver webDriver;


    protected void clickElementByXpath(String xpath) {
        webDriver = ShareDriver.getWebDriver();
        logger.info("Clicking element with xpath" + xpath);
        findElementByXpath(xpath).click();

    }

    public WebElement findElementByXpath(String xpath) {
        webDriver = ShareDriver.getWebDriver();
        logger.info("Finding element with xpath" + xpath);

        WebElement element = webDriver.findElement(By.xpath(xpath));
        return element;
    }

    protected WebElement sendTextToField(String xpath, String text) {
        webDriver = ShareDriver.getWebDriver();
        WebElement element = findElementByXpath(xpath);
        element.sendKeys(text);
        return element;

    }

    public void takeScreensShot(String name) {
        webDriver = ShareDriver.getWebDriver();
        TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("Screenshots/" + name + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






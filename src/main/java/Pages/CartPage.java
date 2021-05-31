package Pages;

import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public static String YOUR_CART_HEADER = "//*[text()='Your cart']";
    public static String CONTINUE_SHOPPING_BUTTON = "//a[text()='Continue shopping']";
    public static final String MAIN_PAGE_LOGO = "//img[@itemprop='logo']";

    public WebElement yourCartHeaderExist() {
        return findElementByXpath(YOUR_CART_HEADER);
    }

    public WebElement continueShoppingButton(){
        clickElementByXpath(CONTINUE_SHOPPING_BUTTON);
       return findElementByXpath(MAIN_PAGE_LOGO);
    }
}


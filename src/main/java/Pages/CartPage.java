package Pages;

import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public static String YOUR_CART_HEADER = "//*[text()='Your cart']";
    public static String LETS_GET_READING_BUTTON = "//a[@class='btn btn--has-icon-after cart__continue-btn']";
    public static final String MAIN_PAGE_LOGO = "//img[@itemprop='logo']";
    public static final String BOOKS_LOGO = "//*[text()='Books']";
    private static final String I_LOVE_TO_BRUSH_MY_TEETH_ENGLISH_BOOK = "//a[@href='/products/i-love-my-mom-english-russian-bilingual-childrens-book?variant=34045508033']";
    private static final String I_LOVE_MY_MOM_ENGLISH_RUSSIAN_BOOK = "//a[@href='/products/i-love-to-eat-fruits-and-vegetables-childrens-book-english-only?variant=33399130113']";
    private static final String CONTINUE_SHOPPING_BUTTON = "//a[text()='Continue shopping']";


    public WebElement yourCartHeaderExist() {

        return findElementByXpath(YOUR_CART_HEADER);
    }

    public WebElement letsGetReadingButton() {
        clickElementByXpath(LETS_GET_READING_BUTTON);
        return findElementByXpath(MAIN_PAGE_LOGO);
    }

    public WebElement englishBookCartTest() {
        return findElementByXpath(I_LOVE_TO_BRUSH_MY_TEETH_ENGLISH_BOOK);

    }

    public WebElement russianBookCartTest() {
        return findElementByXpath(I_LOVE_MY_MOM_ENGLISH_RUSSIAN_BOOK);

    }

    public WebElement continueShoppingButton() {
        clickElementByXpath(CONTINUE_SHOPPING_BUTTON);
        return findElementByXpath(BOOKS_LOGO);
    }
}


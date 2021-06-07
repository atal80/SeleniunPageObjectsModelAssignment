package Pages;

import org.openqa.selenium.WebElement;

public class AllLanguages extends BasePage {
    public static String ALL_LANGUAGES_HEBREW_PAGE_HEADER = "//h1[text()='Hebrew - עִבְרִית']";
    public static String ALL_LANGUAGES_ENGLISH_PAGE_HEADER = "//h1[text()='English Only']";
    public static String ALL_LANGUAGES_RUSSIAN_PAGE_HEADER = "//h1[text()='Russian - Русский']";
    private static final String I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_ENGLISH_BOOK = "//a[@href='/collections/english-only/products/i-love-to-eat-fruits-and-vegetables-childrens-book-english-only']";
    private static final String I_LOVE_TO_BRUSH_MY_TEETH_ENGLISH_BOOK = "//a[@href='/collections/english-only/products/i-love-to-brush-my-teeth-childrens-book-english-only']";
    private static final String I_LOVE_MY_MOM_ENGLISH_RUSSIAN_BOOK = "//a[@href='/collections/russian/products/i-love-my-mom-english-russian-bilingual-childrens-book']";
    private static final String ADD_TO_CART_BUTTON = "//span[@id='AddToCartText-product-template']";

    public WebElement allLanguagesHebrewHeaderExist() {
        return findElementByXpath(ALL_LANGUAGES_HEBREW_PAGE_HEADER);
    }

    public WebElement allLanguagesEnglishHeaderExist() {
        return findElementByXpath(ALL_LANGUAGES_ENGLISH_PAGE_HEADER);
    }

    public WebElement allLanguagesRussianHeaderExist() {
        return findElementByXpath(ALL_LANGUAGES_RUSSIAN_PAGE_HEADER);
    }

    public WebElement findEnglishBook() {
        return findElementByXpath(I_LOVE_TO_EAT_FRUITS_AND_VEGETABLES_ENGLISH_BOOK);
    }

    public WebElement findRussianBook() {
        return findElementByXpath(I_LOVE_MY_MOM_ENGLISH_RUSSIAN_BOOK);
    }

    public WebElement addBookToCart(){
       return findElementByXpath(ADD_TO_CART_BUTTON);
    }
}

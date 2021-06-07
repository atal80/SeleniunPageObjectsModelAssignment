import Consts.Consts;
import Pages.*;
import Utils.ShareDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

public class TeamCityFinalAssignmentTest {

    private static WebDriver webDriver;
    private static MainPage mainPage;
    private static WebDriverWait wait;

    @BeforeAll
    public static void BeforeAllSetup() {
        mainPage = new MainPage();
        webDriver = ShareDriver.getWebDriver();

    }

    @BeforeEach
    public void beforeAllSetup() {
        webDriver.get(Consts.MAIN_PAGE_URL);
        wait = new WebDriverWait(webDriver, 5);

    }

    @AfterAll
    public static void afterAllSetup() {
        ShareDriver.closeDriver();
        webDriver = null;
    }

    //Add books to cart test
    @Test
    public void AddBooksToCart() {

        // English books
        AllLanguages englishLanguage = mainPage.allLanguagesEnglish();
        WebElement allLanguagesEnglishHeader = englishLanguage.allLanguagesEnglishHeaderExist();
        assertNotNull(allLanguagesEnglishHeader);
        WebElement englishBook = englishLanguage.findEnglishBook();
        englishBook.click();
        WebElement englishBookAddToCart = englishLanguage.addBookToCart();
        englishBookAddToCart.click();

        // Russian books
        AllLanguages russianLanguage = mainPage.allLanguagesRussian();
        WebElement allLanguagesRussianHeader = russianLanguage.allLanguagesRussianHeaderExist();
        assertNotNull(allLanguagesRussianHeader);
        WebElement russianBook = russianLanguage.findRussianBook();
        russianBook.click();
        WebElement russianBookAddToCart = russianLanguage.addBookToCart();
        russianBookAddToCart.click();

        //Cart test
        CartPage cartPage = mainPage.cartPage();
        WebElement yourCartHeader = cartPage.yourCartHeaderExist();
        assertNotNull(yourCartHeader);
        WebElement homePageLogo = cartPage.continueShoppingButton();
        assertNotNull(homePageLogo);
    }
}

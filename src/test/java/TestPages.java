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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

public class TestPages {
    public static final Logger logger = LogManager.getLogger(TestPages.class);

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

    // Home PAge Logo Test
    @Test
    public void HomePageTest() {
        logger.info("Home page load test");
        WebElement mainPagelogoExists = mainPage.mainPage();
        mainPage.takeScreensShot("HomePageTest");
        assertNotNull(mainPagelogoExists);
    }

    // Contact Us Menu Test
    @Test
    public void ContactUsPageTest() {
        logger.info("Contact us load page test");
        ContactUsPage contactUsPage = mainPage.contactUsPage();
        WebElement contactUsPageHeader = contactUsPage.contactUsPageNameHeaderExist();
        assertNotNull(contactUsPageHeader);

        WebElement contactUsPageEmailField = contactUsPage.sendText();
        assertNotNull(contactUsPageEmailField);
        WebElement errorMessage = contactUsPage.contactUsErrorMessage();
        assertNotNull(errorMessage);
    }

    //FAQs Menu Test
    @Test
    public void FaqsTest() {
        logger.info("FAQs load page test");
        FAQsPage faQsPage = mainPage.faqsPage();
        WebElement faqsPageHeader = faQsPage.faqsNamePageHeaderExist();
        assertNotNull(faqsPageHeader);
    }

    // Books By Language Menu Test
    @Test
    public void BooksByLanguageTest() {
        logger.info("Books by language drop list test");
        BooksByLanguage booksByLanguage = mainPage.booksByLanguage();
        WebElement englishOnlyHeader = booksByLanguage.englishOnlyPageHeaderExist();
        assertNotNull(englishOnlyHeader);
    }

    //eBooks By Language Menu Test
    @Test
    public void eBooksByLanguageTest() {
        logger.info("eBooks by language drop list test");
        EBooksByLanguage eBooksByLanguage = mainPage.eBooksByLanguage();
        WebElement eBooksInEnglishOnlyHeader = eBooksByLanguage.eBooksInEglishOnlyHeaderExist();
        assertNotNull(eBooksInEnglishOnlyHeader);
    }

    //Resources Menu Test
    @Test
    public void ResourcesTest() {
        logger.info("Resources drop list test");
        Resources resources = mainPage.resouces();
        WebElement resourcesVideoHeader = resources.resourcesVideoPageHeaderExist();
        assertNotNull(resourcesVideoHeader);
    }

    //All Languages Menu Test Hebrew Language
    @Test
    public void AllLanguagesTestHebrew() {
        logger.info("All languages drop list test");
        AllLanguages allLanguages = mainPage.allLanguagesHebrew();
        WebElement allLanguagesHebrewHeader = allLanguages.allLanguagesHebrewHeaderExist();
        assertNotNull(allLanguagesHebrewHeader);
    }

    // Blog Page Test
    @Test
    public void BlogPageTest() {
        logger.info("Blog load page test");
        BlogPage blogPage = mainPage.blogPage();
        WebElement blogHeader = blogPage.blogPageNameHeaderExist();
        assertNotNull(blogHeader);
//        WebElement holiday = blogPage.holidayDropListExist();
//        assertNotNull(holiday);
    }

    // LogIn Page Test
//    @Test
//    public void LogInTest() {
//        logger.info("LogIn page test");
//        LogInPage logInPage = mainPage.logInPage();
//        WebElement logInHeader = logInPage.logInHeaderExist();
//        assertNotNull(logInHeader);
//        WebElement element = logInPage.emailField();
//        assertNotNull(element);
//        WebElement incorrectEmailOrPassword = logInPage.logInErrorMessage();
//        assertNotNull(incorrectEmailOrPassword);
//    }

    // Create Account Test
    @Test
    public void CreateAccountTest() throws InterruptedException {
        CreateAccount createAccount = mainPage.createAccount();
        WebElement firstName = createAccount.firstNameField();
        assertNotNull(firstName);
        WebElement lastName = createAccount.lastNameField();
        assertNotNull(lastName);
        WebElement email = createAccount.emailField();
        assertNotNull(email);
        WebElement password = createAccount.passwordField();
        assertNotNull(password);
    }

    //All Languages Menu Test English Language
    @Test
    public void AllLanguagesTestEnglish(){


}

    // Cart Test
    @Test
    public void CartTest() {
        CartPage cartPage = mainPage.cartPage();
        WebElement yourCartHeader = cartPage.yourCartHeaderExist();
        assertNotNull(yourCartHeader);
        WebElement homePageLogo = cartPage.letsGetReadingButton();
        assertNotNull(homePageLogo);
    }


}
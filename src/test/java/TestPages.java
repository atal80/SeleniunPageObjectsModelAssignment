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

    @Test
    public void HomePageTest() {
        logger.info("Home page load test");
        WebElement mainPagelogoExists = mainPage.mainPage();
        mainPage.takeScreensShot("HomePageTest");
        assertNotNull(mainPagelogoExists);

    }

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

    @Test
    public void FaqsTest() {
        logger.info("FAQs load page test");
        FAQsPage faQsPage = mainPage.faqsPage();
        WebElement faqsPageHeader = faQsPage.faqsNamePageHeaderExist();
        assertNotNull(faqsPageHeader);

    }

    @Test
    public void BooksByLanguageTest() {
        logger.info("Books by language drop list test");
        BooksByLanguage booksByLanguage = mainPage.booksByLanguage();
        WebElement englishOnlyHeader = booksByLanguage.englishOnlyPageHeaderExist();
        assertNotNull(englishOnlyHeader);
    }

    @Test
    public void eBooksByLanguageTest() {
        logger.info("eBooks by language drop list test");
        EBooksByLanguage eBooksByLanguage = mainPage.eBooksByLanguage();
        WebElement eBooksInEnglishOnlyHeader = eBooksByLanguage.eBooksInEglishOnlyHeaderExist();
        assertNotNull(eBooksInEnglishOnlyHeader);

    }

    @Test
    public void ResourcesTest() {
        logger.info("Resources drop list test");
        Resources resources = mainPage.resouces();
        WebElement resourcesVideoHeader = resources.resourcesVideoPageHeaderExist();
        assertNotNull(resourcesVideoHeader);
    }

    @Test
    public void AllLanguagesTest() {
        logger.info("All languages drop list test");
        AllLanguages allLanguages = mainPage.allLanguages();
        WebElement allLanguagesHebrewHeader = allLanguages.allLanguagesHebrewHeaderExist();
        assertNotNull(allLanguagesHebrewHeader);

    }

    @Test
    public void BlogPageTest() {
        logger.info("Blog load page test");
        BlogPage blogPage = mainPage.blogPage();
        WebElement blogHeader = blogPage.blogPageNameHeaderExist();
        assertNotNull(blogHeader);
        WebElement holiday = blogPage.holidayDropListExist();
        assertNotNull(holiday);

    }

    @Test
    public void LogInTest() {
        logger.info("LogIn page test");
        LogInPage logInPage = mainPage.logInPage();
        WebElement logInHeader = logInPage.logInHeaderExist();
        assertNotNull(logInHeader);
        WebElement element = logInPage.emailField();
        assertNotNull(element);
        WebElement incorrectEmailOrPassword = logInPage.logInErrorMessage();
        assertNotNull(incorrectEmailOrPassword);

    }
}
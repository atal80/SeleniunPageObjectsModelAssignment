package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    protected static WebDriver webDriver;
    public static final String MAIN_PAGE_LOGO = "//img[@itemprop='logo']";
    private static final String CONTACT_US = "//a[text()='Contact us']";
    private static final String FAQS = "//a[text()='FAQs']";
    private static final String BOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-books-by-language']";
    private static final String BOOKS_BY_LANGUAGE_ENGLISH_ONLY_DROP_MENU = "//a[text()='English Only']";
    private static final String EBOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-ebooks-by-language']";
    private static final String EBOOKS_BY_LANGUAGE_ENGLISH_ONLY_DROP_MENU = "//*[@id='SiteNavLabel-ebooks-by-language']/ul/li[5]/a";
    private static final String RESOURCES = "//a[@aria-controls='SiteNavLabel-resources']";
    private static final String RESOURCES_VIDEOS_DROP_MENU = "//a[text()='Videos']";
    private static final String ALL_LANGUAGES = "//a[@aria-controls='SiteNavLabel-all-languages']";
    private static final String ALL_LANGUAGES_HEBREW_DROP_MENU = "//*[@id='SiteNavLabel-all-languages']/ul/li[13]/a";
    private static final String ALL_LANGUAGES_ENGLISH_DROP_MENU = "//*[@id='SiteNavLabel-all-languages']/ul/li[8]/a";
    private static final String ALL_LANGUAGES_RUSSIAN_DROP_MENU = "//*[@id='SiteNavLabel-all-languages']/ul/li[26]/a";
    private static final String BLOG = "//*[@id='AccessibleNav']/ul/li[11]/a";
    private static final String BLOG_ALL_TOPICS = "//*[@id='BlogTagFilter']";
    private static final String BLOG_ALL_TOPICS_HOLIDAY = "//*[text()='holiday']";
    private static final String LOGIN = "//*[@class='icon icon-login']";
    private static final String CART = "//a[@href='/cart']";
    private static final String CREATE_ACCOUNT_BUTTON = "//a[text()='Create account']";


    //   private static final String TEXT_TO_CONTACT_US = "//input[type='text']";


    public WebElement mainPage() {
        WebElement mainPageLogo = findElementByXpath(MAIN_PAGE_LOGO);
        return mainPageLogo;
    }

    public ContactUsPage contactUsPage() {
        clickElementByXpath(CONTACT_US);
        return new ContactUsPage();

    }

    public FAQsPage faqsPage() {
        clickElementByXpath(FAQS);
        return new FAQsPage();
    }

    public BooksByLanguage booksByLanguage() {

        clickElementByXpath(BOOKS_BY_LANGUAGE);
        clickElementByXpath(BOOKS_BY_LANGUAGE_ENGLISH_ONLY_DROP_MENU);
        return new BooksByLanguage();
    }

    public EBooksByLanguage eBooksByLanguage() {
        clickElementByXpath(EBOOKS_BY_LANGUAGE);
        clickElementByXpath(EBOOKS_BY_LANGUAGE_ENGLISH_ONLY_DROP_MENU);
        return new EBooksByLanguage();
    }

    public Resources resouces() {
        clickElementByXpath(RESOURCES);
        clickElementByXpath(RESOURCES_VIDEOS_DROP_MENU);
        return new Resources();
    }
// All Languages Menu
    public AllLanguages allLanguagesHebrew() {
        clickElementByXpath(ALL_LANGUAGES);
        clickElementByXpath(ALL_LANGUAGES_HEBREW_DROP_MENU);
        return new AllLanguages();
    }

    public AllLanguages allLanguagesEnglish() {
        clickElementByXpath(ALL_LANGUAGES);
        clickElementByXpath(ALL_LANGUAGES_ENGLISH_DROP_MENU);
        return new AllLanguages();
    }

    public AllLanguages allLanguagesRussian() {
        clickElementByXpath(ALL_LANGUAGES);
        clickElementByXpath(ALL_LANGUAGES_RUSSIAN_DROP_MENU);
        return new AllLanguages();
    }

    public BlogPage blogPage() {
        clickElementByXpath(BLOG);
        clickElementByXpath(BLOG_ALL_TOPICS);
        clickElementByXpath(BLOG_ALL_TOPICS_HOLIDAY);
        return new BlogPage();

    }

    public LogInPage logInPage() {
        clickElementByXpath(LOGIN);
        return new LogInPage();
    }
    public CartPage cartPage(){
       clickElementByXpath(CART);
       return new CartPage();
    }
    public CreateAccount createAccount() {
        clickElementByXpath(LOGIN);
        clickElementByXpath(CREATE_ACCOUNT_BUTTON);
        return new CreateAccount();
    }
}
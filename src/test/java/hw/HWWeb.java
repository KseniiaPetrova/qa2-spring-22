package hw;

import org.openqa.selenium.By;

public class HWWeb {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By ORDER_INFO = By.xpath(".//a[@class = 'site-top__menu-left-link']");
    private final By LANGUAGE_SWITCHER_LV = By.xpath(".//a[@class = 'site-top__menu-right-link']");
    private final By LANGUAGE_SWITCHER_RU = By.xpath(".//a[@class = 'site-top__menu-right-link']");
    private final By MAIN_LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By MAIN_SEARCH = By.xpath(".//button[@class = 'main-search-submit']");
    private final By FAVORITE_ITEMS = By.xpath(".//a[@class = 'favorite-items__handle']");
    private final By PRODUCT_MENU_COMPUTER_TECH = By.xpath(".//li[@class = 'submenu-lvl1__list-item color-theme-17 submenu-lvl1__list-item--has-child']");
    private final By PRODUCT_MENU_COMPONENTS = By.xpath(".//li[@class = 'submenu-lvl1__list-item color-theme-21 submenu-lvl1__list-item--has-child']");
    private final By PRODUCT_MENU_PHONE = By.xpath(".//li[@class = 'submenu-lvl1__list-item color-theme-22 submenu-lvl1__list-item--has-child']");
    private final By PRODUCT_MENU_TV = By.xpath(".//li[@class = 'submenu-lvl1__list-item color-theme-2 submenu-lvl1__list-item--has-child']");
    private final By WELCOME_PAGE = By.xpath(".//div[@class = 'glide__track']");
    private final By COOKIE_BUTTON = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
}


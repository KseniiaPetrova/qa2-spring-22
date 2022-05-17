package hw;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWForms {
    private final String HOME_PAGE_URL = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_CODE_INPUT = By.id("discount");
    private final By ADULT_PASSENGER_INPUT = By.id("adults");
    private final By CHILDREN_PASSENGER_INPUT = By.id("children");
    private final By LUGGAGE_INPUT = By.id("bugs");
    private final By DROPDOWN =  By.id("flight");
    private final By GET_PRISE_BUTTON = By.xpath(".//*[@id=\"fullForm\"]/span[8]");

    @Test
    public  void formCheck () {
        System.setProperty("webdriver.chrome.driver", "/Users/petrovaks/Downloads/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement inputName =  browser.findElement(NAME_INPUT);
        inputName.sendKeys("Agatha");

        WebElement inputSurname = browser.findElement(SURNAME_INPUT);
        inputSurname.sendKeys("Christie");

        WebElement inputDiscountCode = browser.findElement(DISCOUNT_CODE_INPUT);
        inputDiscountCode.sendKeys("HopHeY!");

        WebElement inputAdultPassenger = browser.findElement(ADULT_PASSENGER_INPUT);
        inputAdultPassenger.sendKeys("5");

        WebElement inputChildrenPassenger = browser.findElement(CHILDREN_PASSENGER_INPUT);
        inputChildrenPassenger.sendKeys("4");

        WebElement inputLuggage = browser.findElement(LUGGAGE_INPUT);
        inputLuggage.sendKeys("7");

        Select dropdown = new Select(browser.findElement(DROPDOWN));
        dropdown.selectByValue("11");

        WebElement getPriseButton = browser.findElement(GET_PRISE_BUTTON);
        getPriseButton.click();
    }
}



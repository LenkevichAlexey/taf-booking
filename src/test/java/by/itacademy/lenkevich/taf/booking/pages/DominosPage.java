package by.itacademy.lenkevich.taf.booking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {
    ChromeDriver driver;
    String buttonCloseCssSelector = "body > div.custom-modal.custom-modal--size-content.custom-modal--padding-none.custom-modal--bg-transparent > div.custom-modal__content-holder > button > span > span.custom-button__content-children > svg > g > path";
    String buttonSignInXpath = "//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button/span/span[2]";
    String inputEmail = "email";
    String inputPassword = "password";
    String buttonLoginXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button/span/span[2]";
    String textResultLocator = "/html/body/div[5]/div[2]/div[1]/div";

    public DominosPage(ChromeDriver newDriver) {

        driver = newDriver;
    }

    public DominosPage clickCloseButton() {
        driver.findElement(By.cssSelector(buttonCloseCssSelector)).click();
        return this;
    }

    public DominosPage clickSignInButton() {
        driver.findElement(By.xpath(buttonSignInXpath)).click();
        return this;
    }

    public DominosPage sendKeysInputEmailField(String str) {
        driver.findElement(By.name(inputEmail)).sendKeys(str);
        return this;
    }

    public DominosPage sendKeysInputPasswordField(String str) {
        driver.findElement(By.name(inputPassword)).sendKeys(str);
        return this;
    }

    public DominosPage clickLogInButton() {
        driver.findElement(By.xpath(buttonLoginXpath)).click();
        return this;
    }

    public String getResultText() {
        String resultField = driver.findElement(By.xpath(textResultLocator)).getText();
        return resultField;
    }

}

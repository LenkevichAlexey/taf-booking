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
        WebElement buttonClose = driver.findElement(By.cssSelector(buttonCloseCssSelector));
        buttonClose.click();
        return this;
    }

    public DominosPage clickSignInButton() {
        WebElement buttonSignIn = driver.findElement(By.xpath(buttonSignInXpath));
        buttonSignIn.click();
        return this;
    }

    public DominosPage sendKeysInputEmailField(String str) {
        WebElement emailInputEmailField = driver.findElement(By.name(inputEmail));
        emailInputEmailField.sendKeys(str);
        return this;
    }

    public DominosPage sendKeysInputPasswordField(String str) {
        WebElement emailInputPasswordField = driver.findElement(By.name(inputPassword));
        emailInputPasswordField.sendKeys(str);
        return this;
    }

    public DominosPage clickLogInButton() {
        WebElement buttonLogIn = driver.findElement(By.xpath(buttonLoginXpath));
        buttonLogIn.click();
        return this;
    }

    public String getResultText() {
        WebElement resultField = driver.findElement(By.xpath(textResultLocator));
        return resultField.getText();
    }

}

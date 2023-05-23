package by.itacademy.lenkevich.taf.booking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DominosPage {
    ChromeDriver driver;
    String buttonCloseCssSelector = "body > div.custom-modal.custom-modal--size-content.custom-modal--padding-none.custom-modal--bg-transparent > div.custom-modal__content-holder > button > span > span.custom-button__content-children > svg > g > path";
    String buttonSignInXpath = "//*[@id='app-root']/div/div[1]/div[1]/div/div[4]/div/div/div[3]/button/span/span[2]";
    String inputEmailXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[1]/input";
    String inputPasswordXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/div[2]/input";
    String buttonLoginXpath = "/html/body/div[4]/div[2]/div/div/div/div[2]/div[2]/div/form/div/button/span/span[2]";

    public DominosPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickCloseButton(){
        WebElement buttonClose = driver.findElement(By.cssSelector(buttonCloseCssSelector));
        buttonClose.click();
    }

    public void clickSignInButton(){
        WebElement buttonSignIn = driver.findElement(By.xpath(buttonSignInXpath));
        buttonSignIn.click();
    }

    public void sendKeysInputEmailField(String str) {
        WebElement emailInputEmailField = driver.findElement(By.xpath(inputEmailXpath));
        emailInputEmailField.sendKeys(str);
    }

    public void sendKeysInputPasswordField(String str) {
        WebElement emailInputPasswordField = driver.findElement(By.xpath(inputPasswordXpath));
        emailInputPasswordField.sendKeys(str);
    }

    public void clickLogInButton(){
        WebElement buttonLogIn = driver.findElement(By.xpath(buttonLoginXpath));
        buttonLogIn.click();
    }

}
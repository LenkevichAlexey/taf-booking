package by.itacademy.lenkevich.taf.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    ChromeDriver driver;
    String inputEmail = "astroauth_login";
    String inputPassword = "astroauth_pass";
    String buttonSubmit = "astroauth_submit";

    public PizzatempoPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickLoginButton() {
        WebElement buttonLogin = driver.findElement(By.name(buttonSubmit));
        buttonLogin.click();
    }

    public void sendKeysInputEmailField(String str) {
        WebElement inputEmailField = driver.findElement(By.name(inputEmail));
        inputEmailField.sendKeys(str);
    }

    public void sendKeysInputPasswordField(String str) {
        WebElement inputPasswordField = driver.findElement(By.name(inputPassword));
        inputPasswordField.sendKeys(str);
    }
}

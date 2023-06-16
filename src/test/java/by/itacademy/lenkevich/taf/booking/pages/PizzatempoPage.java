package by.itacademy.lenkevich.taf.booking.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    ChromeDriver driver;
    String inputEmail = "astroauth_login";
    String inputPassword = "astroauth_pass";
    String buttonSubmit = "astroauth_submit";
    String resultLocator = "//*[@id=\"alert\"]/div[2]/div[2]";

    public PizzatempoPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public PizzatempoPage clickLoginButton() {
        driver.findElement(By.name(buttonSubmit)).click();
        return this;
    }

    public PizzatempoPage sendKeysInputEmailField(String str) {
        driver.findElement(By.name(inputEmail)).sendKeys(str);
        return this;
    }

    public PizzatempoPage sendKeysInputPasswordField(String str) {
        driver.findElement(By.name(inputPassword)).sendKeys(str);
        return this;
    }

    public String getResultText() {
        String resultField = driver.findElement(By.xpath(resultLocator)).getText();
        return resultField;
    }
}

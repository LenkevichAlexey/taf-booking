package by.itacademy.lenkevich.taf.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoPage {
    ChromeDriver driver;
    String inputEmailXpath = "/html/body/div/div[1]/form/p[1]/input";
    String inputPasswordXpath = "/html/body/div/div[1]/form/p[2]/input[1]";
    String buttonLoginXpath = "/html/body/div/div[1]/form/p[2]/input[2]";

    public PizzatempoPage(ChromeDriver newDriver) {
        driver = newDriver;
    }

    public void clickLoginButton(){
        WebElement buttonLogin = driver.findElement(By.xpath(buttonLoginXpath));
        buttonLogin.click();
    }

    public void sendKeysInputEmailField(String str) {
        WebElement emailInputEmailField = driver.findElement(By.xpath(inputEmailXpath));
        emailInputEmailField.sendKeys(str);
    }

    public void sendKeysInputPasswordField(String str) {
        WebElement emailInputPasswordField = driver.findElement(By.xpath(inputPasswordXpath));
        emailInputPasswordField.sendKeys(str);
    }
}

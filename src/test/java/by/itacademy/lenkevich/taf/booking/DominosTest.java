package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DominosTest {
    DominosPage dominosPage = new DominosPage();
    ChromeDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
    }

    @Test
    public void testIncorrectEmailAndPassword() {

        WebElement buttonClose = driver.findElement(By.cssSelector(dominosPage.buttonCloseCssSelector));
        buttonClose.click();

        WebElement buttonSignIn = driver.findElement(By.xpath(dominosPage.buttonSignInXpath));
        buttonSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(dominosPage.inputEmailXpath));
        inputEmail.sendKeys("test@test.com");

        WebElement inputPassword = driver.findElement(By.xpath(dominosPage.inputPasswordXpath));
        inputPassword.sendKeys("Qwerty123!");

        WebElement buttonLogin = driver.findElement(By.xpath(dominosPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @Test
    public void testCorrectEmailAndPassword() {

        WebElement buttonClose = driver.findElement(By.cssSelector(dominosPage.buttonCloseCssSelector));
        buttonClose.click();

        WebElement buttonSignIn = driver.findElement(By.xpath(dominosPage.buttonSignInXpath));
        buttonSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(dominosPage.inputEmailXpath));
        inputEmail.sendKeys("test@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(dominosPage.inputPasswordXpath));
        inputPassword.sendKeys("Qwerty123!");

        WebElement buttonLogin = driver.findElement(By.xpath(dominosPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}

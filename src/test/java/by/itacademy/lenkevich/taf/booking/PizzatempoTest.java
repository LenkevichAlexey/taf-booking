package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    PizzatempoPage pizzatempoPage = new PizzatempoPage();
    ChromeDriver driver;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
    }

    @Test
    public void testEmptyEmailAndPassword() {

        WebElement buttonLogin = driver.findElement(By.xpath(pizzatempoPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @Test
    public void testIncorrectEmail() {

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.inputEmailXpath));
        inputEmail.sendKeys("email");

        WebElement buttonLogin = driver.findElement(By.xpath(pizzatempoPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @Test
    public void testEmptyEmailAndCorrectPassword() {

        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPasswordXpath));
        inputPassword.sendKeys("Qwerty123!");

        WebElement buttonLogin = driver.findElement(By.xpath(pizzatempoPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @Test
    public void testCorrectEmailAndEmptyPassword() {

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.inputEmailXpath));
        inputEmail.sendKeys("Email@gmail.com");

        WebElement buttonLogin = driver.findElement(By.xpath(pizzatempoPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @Test
    public void testCorrectEmailAndPassword() {

        WebElement inputEmail = driver.findElement(By.xpath(pizzatempoPage.inputEmailXpath));
        inputEmail.sendKeys("Email@gmail.com");

        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPasswordXpath));
        inputPassword.sendKeys("Qwerty123!");

        WebElement buttonLogin = driver.findElement(By.xpath(pizzatempoPage.buttonLoginXpath));
        buttonLogin.click();
    }

    @AfterEach
    public void tearsDown() {

        driver.quit();
    }
}

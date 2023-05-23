package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzatempoTest {
    ChromeDriver driver;
    PizzatempoPage pizzatempoPage;
    Until until;


    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        pizzatempoPage = new PizzatempoPage(driver);
    }

    @Test
    public void testEmptyEmailAndPassword() {

        pizzatempoPage.clickLoginButton();
    }

    @Test
    public void testIncorrectEmail() {
        pizzatempoPage.sendKeysInputEmailField(until.generateEmail());
        pizzatempoPage.clickLoginButton();
    }

    @Test
    public void testIncorrectPassword() {
        pizzatempoPage.sendKeysInputEmailField(until.generatePassword());
        pizzatempoPage.clickLoginButton();
    }

    @Test
    public void testEmptyEmailAndCorrectPassword() {

        pizzatempoPage.sendKeysInputPasswordField("Qwerty123!");
        pizzatempoPage.clickLoginButton();

    }

    @Test
    public void testCorrectEmailAndEmptyPassword() {

        pizzatempoPage.sendKeysInputEmailField("test@gmail.com");
        pizzatempoPage.clickLoginButton();

    }

    @Test
    public void testCorrectEmailAndPassword() {

        pizzatempoPage.sendKeysInputEmailField("test@gmail.com");
        pizzatempoPage.sendKeysInputPasswordField("Qwerty123!");
        pizzatempoPage.clickLoginButton();

    }

    @Test
    public void testInCorrectEmailAndPassword() {

        pizzatempoPage.sendKeysInputEmailField(until.generateEmail());
        pizzatempoPage.sendKeysInputPasswordField(until.generatePassword());
        pizzatempoPage.clickLoginButton();

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}

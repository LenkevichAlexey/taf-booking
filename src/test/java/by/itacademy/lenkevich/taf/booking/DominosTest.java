package by.itacademy.lenkevich.taf.booking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DominosTest {
    ChromeDriver driver;
    DominosPage dominosPage;
    Until until;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
        dominosPage = new DominosPage(driver);
    }

    @Test
    public void testIncorrectEmailAndPassword() {

        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputEmailField(until.generateEmail());
        dominosPage.sendKeysInputPasswordField(until.generatePassword());
        dominosPage.clickLogInButton();
    }

    @Test
    public void testCorrectEmailAndPassword() {

        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputEmailField("test@gmail.com");
        dominosPage.sendKeysInputPasswordField("Qwerty123!");
        dominosPage.clickLogInButton();
    }

    @Test
    public void testIncorrectEmailAndEmptyPassword() {

        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputEmailField(until.generateEmail());
        dominosPage.clickLogInButton();
    }

    @Test
    public void testEmptyEmailAndIncorrectPassword() {

        dominosPage.clickCloseButton();
        dominosPage.clickSignInButton();
        dominosPage.sendKeysInputPasswordField(until.generatePassword());
        dominosPage.clickLogInButton();
    }

    @AfterEach
    public void tearsDown()
    {
        driver.quit();
    }
}

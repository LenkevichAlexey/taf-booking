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
    PizzatempoStep pizzatempoStep;


    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://www.pizzatempo.by/");
        driver.manage().window().maximize();
        pizzatempoPage = new PizzatempoPage(driver);
        pizzatempoStep = new PizzatempoStep(driver);

    }

    @Test
    public void testEmptyEmailAndEmptyPassword() {

        pizzatempoStep.clickSubmitButton();
    }

    @Test
    public void testIncorrectEmail() {

        pizzatempoStep.fillIncorrectEmailAndSubmitButton("until.generateEmail()");
    }

    @Test
    public void testIncorrectPassword() {
        pizzatempoStep.fillIncorrectPasswordAndSubmitButton(until.generatePassword());
    }

    @Test
    public void testEmptyEmailAndCorrectPassword() {

        pizzatempoStep.fillEmptyEmailAndCorrectPassword("Qwerty123!");
    }

    @Test
    public void testCorrectEmailAndEmptyPassword() {

        pizzatempoStep.fillCorrectEmailAndEmptyPassword("test@gmail.com");

    }

    @Test
    public void testCorrectEmailAndCorrectPassword() {

        pizzatempoStep.fillCorrectEmailAndCorrectPassword("test@gmail.com", "Qwerty123!");

    }

    @Test
    public void testIncorrectEmailAndIncorrectPassword() {

        pizzatempoStep.fillIncorrectEmailAndIncorrectPassword(until.generateEmail(), until.generatePassword());

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}

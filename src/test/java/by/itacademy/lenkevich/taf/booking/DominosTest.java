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
    DominosStep dominosStep;
    Until until;

    @BeforeEach
    public void warmUp() {
        driver = new ChromeDriver();
        driver.get("https://dominos.by/");
        driver.manage().window().maximize();
        dominosPage = new DominosPage(driver);
        dominosStep = new DominosStep(driver);
    }

    @Test
    public void testIncorrectEmailAndIncorrectPassword() {

        dominosStep.fillIncorrectEmailAndIncorrectPassword(until.generateEmail(), until.generatePassword());

    }

    @Test
    public void testCorrectEmailAndCorrectPassword() {

        dominosStep.fillCorrectEmailAndCorrectPassword("test@gmail.com", "Qwerty123!");

    }

    @Test
    public void testIncorrectEmailAndEmptyPassword() {

        dominosStep.fillIncorrectEmailAndEmptyPassword(until.generateEmail());

    }

    @Test
    public void testEmptyEmailAndIncorrectPassword() {

        dominosStep.fillEmptyEmailAndInccorectPassword(until.generatePassword());

    }

    @AfterEach
    public void tearsDown() {
        driver.quit();
    }
}
